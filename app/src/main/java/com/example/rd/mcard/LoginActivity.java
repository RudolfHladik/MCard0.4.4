package com.example.rd.mcard;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RD on 3.9.2014.
 */
public class LoginActivity extends FragmentActivity  {

    String url;
    Context context;
    String userId,s = "c";
    User u = new User();
    int i = 1;




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
//                registerNewUser();
                Intent service = new Intent(getApplicationContext(), BackgroundService.class);
                service.putExtra("action", " newUser");
                startService(service);
//                try {



//                }catch (NullPointerException n){
//
//                    Log.d("null pointer except..", n.toString());
//                }
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("user", "exists");
                startActivity(intent);
            }
        });
//
    }
    private void registerNewUser() {


        // VOLLEY part //

        RequestQueue queue = Volley.newRequestQueue(context);


//        TODO url = "http://terrell.wz.cz/new_user.php";


        String url = "http://terrell.wz.cz/new_user.php";
        StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {

                        userId = response;
                        if (!userId.equals(null)) {
                            User user = new User(userId);
                            CRUDer adapter = new CRUDer(getApplicationContext());

                            long id = adapter.saveUserToDB(user);

                            }





                        // response
                        Log.d("Response", response);
                        Log.d("Response user", userId);


                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {


                        // error
                        Log.d("Error.Response", String.valueOf(error));
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String> params = new HashMap<String, String>();
                params.put("action", "regUser");


                return params;
            }
        };
        queue.add(postRequest);



//        SQLiteDatabase db = new SQLiteDatabase();
//        String sqlInsertUser = ""
//        db.execSQL();


    }
    private static boolean doesDatabaseExist(ContextWrapper context, String dbName) {
        File dbFile = context.getDatabasePath(dbName);
        return dbFile.exists();
    }



    public void showNoticeDialog() {
        // Create an instance of the dialog fragment and show it
        DialogFragment dialog = new AreYouSureDialogFragment();
        dialog.show(getFragmentManager(), "AreYouSureDialogFragment");
    }


}
