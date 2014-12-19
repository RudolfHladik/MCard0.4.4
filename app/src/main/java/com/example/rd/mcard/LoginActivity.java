package com.example.rd.mcard;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by RD on 3.9.2014.
 */
public class LoginActivity extends FragmentActivity  {

    final String url = "http://rudolfhladik.com/new_user.php";
    Context context;
    private static final long REQUEST_TIMEOUT = 30;
    String userID = "nic neprislo";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context = getApplicationContext();




        try{

            if (doesDatabaseExist((ContextWrapper) getApplicationContext(),"mcard.db")){
                Toast.makeText(context, "databaze existuje", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("user", "exists");
                startActivity(intent);


            }else {
                Toast.makeText(getApplicationContext(), "databaze neexistuje", Toast.LENGTH_SHORT).show();





            }


        }catch (Exception e) {
            Log.d( "Exception: ", e.getMessage().toString());

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
            pDialog.setMessage("Registring new user");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();



        }

        @Override
        protected JSONObject doInBackground(String... strings) {

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = jsonParser.getJSONFromUrl(url);


            return jsonObject;
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

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);



            }catch (JSONException e){

            }

        }
    }

    private static boolean doesDatabaseExist(ContextWrapper context, String dbName) {
        File dbFile = context.getDatabasePath(dbName);
        return dbFile.exists();
    }
    public boolean isOnline() {

        Runtime runtime = Runtime.getRuntime();
        try {

            Process ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8");
            int     exitValue = ipProcess.waitFor();
            return (exitValue == 0);

        } catch (IOException e)          { e.printStackTrace(); }
        catch (InterruptedException e) { e.printStackTrace(); }

        return false;
    }

}
