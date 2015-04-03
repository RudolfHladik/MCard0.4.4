package com.rudolfhladik.rd.disciplines.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rudolfhladik.rd.disciplines.CRUDer;
import com.rudolfhladik.rd.disciplines.JSONParser;
import com.rudolfhladik.rd.disciplines.MainActivity;
import com.rudolfhladik.rd.disciplines.R;
import com.rudolfhladik.rd.disciplines.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;


/**
 * Created by RD on 3.9.2014.
 */
public class LoginActivity extends FragmentActivity  {

    final String url = "http://rudolfhladik.com/new_user.php";
    Context context;
    private static final long REQUEST_TIMEOUT = 30;
    String userID = "nic neprislo";
    public static final String PREF_NAME = "acount_preferences";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context = getApplicationContext();




        try{

            if (doesDatabaseExist((ContextWrapper) getApplicationContext(),"swtor.db")){
//                Toast.makeText(context, "databaze existuje", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("user", "exists");
                startActivity(intent);
                finish();


            }else {
//                Toast.makeText(getApplicationContext(), "databaze neexistuje", Toast.LENGTH_SHORT).show();





            }


        }catch (Exception e) {
            Log.d( "Exception: ", e.getMessage());

        }






        Button button = (Button) findViewById(R.id.btm_login_anonym);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
        if (isOnline()) {
            new Async().execute();
        }else{
            Toast.makeText(getApplicationContext(),"there is no internet connection.",Toast.LENGTH_SHORT).show();
        }

            }
        });
//
    }
    private class Async extends AsyncTask<String, String, JSONObject> {

        private ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(LoginActivity.this);
            pDialog.setMessage("Registering new user");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();



        }

        @Override
        protected JSONObject doInBackground(String... strings) {

            JSONParser jsonParser = new JSONParser();



            return jsonParser.getJSONFromUrl(url);
        }

        @Override
        protected void onPostExecute(JSONObject jsonObject) {
            super.onPostExecute(jsonObject);
            pDialog.dismiss();

            try {
                userID = jsonObject.getString("userID");
                User user = new User(userID);
                CRUDer adapter = new CRUDer(LoginActivity.this);

                long id = adapter.saveUserToDB(user);
                SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("userID", userID);
                editor.commit();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();



            }catch (JSONException e){
                e.printStackTrace();

            }

        }
    }

    private static boolean doesDatabaseExist(ContextWrapper context, String dbName) {
        File dbFile = context.getDatabasePath(dbName);
        return dbFile.exists();
    }
    public boolean isOnline() {

        Runtime runtime = Runtime.getRuntime();
        int     exitValue= 0;
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
            //TODO ping not working on SDK < LOLLIPOP
            return true;
        }else {
            try {


                Process ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8");
                exitValue = ipProcess.waitFor();
                ipProcess.destroy();
                return (exitValue == 0);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        return false;
    }

}
