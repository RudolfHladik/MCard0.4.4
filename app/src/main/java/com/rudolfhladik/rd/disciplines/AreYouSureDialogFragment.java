package com.rudolfhladik.rd.disciplines;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RD on 5.9.2014.
 */
public class AreYouSureDialogFragment extends DialogFragment {
    public String userId = null;
    public boolean userCreatedSuccessfully = false;
    public boolean ok = false;



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {   // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Are you sure")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // FIRE ZE MISSILES!
                                Toast.makeText(getActivity(),"context", Toast.LENGTH_LONG).show();
                                ok = registerNewUser();
                                if (ok == true) {


                                    Intent intent = new Intent(getActivity(), MainActivity.class);
                                    intent.putExtra("user", "exists");
                                    startActivity(intent);
                                }
                            }
                        }
                )
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }


    /* The activity that creates an instance of this dialog fragment must
         * implement this interface in order to receive event callbacks.
         * Each method passes the DialogFragment in case the host needs to query it. */
    public interface NoticeDialogListener {
        public void onDialogPositiveClick(DialogFragment dialog);
        public void onDialogNegativeClick(DialogFragment dialog);
    }


    // Use this instance of the interface to deliver action events
    NoticeDialogListener mListener;

//
private boolean registerNewUser() {


    // VOLLEY part //

    RequestQueue queue = Volley.newRequestQueue(getActivity());


//        TODO url = "http://terrell.wz.cz/new_user.php";


    String url = "http://terrell.wz.cz/new_user.php";
    StringRequest postRequest = new StringRequest(Request.Method.POST, url,
            new Response.Listener<String>()
            {
                @Override
                public void onResponse(String response) {

                    userId = response;
                    if (userId.equals(null)) {

                    }else {

                        User user = new User(userId);
                        CRUDer adapter = new CRUDer(getActivity());

                       long id = adapter.saveUserToDB(user);
                        if (id<0) {

                        }
                        else {
                            userCreatedSuccessfully = true;
                        }
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

return userCreatedSuccessfully;
}

    // Override the Fragment.onAttach() method to instantiate the NoticeDialogListener
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the NoticeDialogListener so we can send events to the host
            mListener = (NoticeDialogListener) activity;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface, throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement NoticeDialogListener");
        }
    }

}
