package com.rudolfhladik.rd.disciplines;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by RD on 21.10.2014.
 */
public class BackgroundService extends IntentService {

    private static final long REQUEST_TIMEOUT = 30;
    String userID = "nic neprislo";

    public BackgroundService(){
        super("BackgroundService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {


        // gets data from the incoming intent
//        String userName =  intent.getStringExtra("userName");

        // send synchronous request
//        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
//        String url = "http://rudolfhladik.com/new_user.php";
//
//
//        StringRequest postRequest = new StringRequest(Request.Method.POST, url,
//                new Response.Listener<String>()
//                {
//                    @Override
//                    public void onResponse(String response) {
//                        userID = response;
//                        // response
//                        Log.d("Response", response);
//                    }
//                },
//                new Response.ErrorListener()
//                {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        // error
//                        Log.d("Error.Response", String.valueOf(error));
//                    }
//                }
//        ) {
//            @Override
//            protected Map<String, String> getParams()
//            {
//                Map<String, String> params = new HashMap<String, String>();
//                params.put("action", "regUser");
//
//
//                return params;
//            }
//        };
//        queue.add(postRequest);

//        Map<String, String> params = new HashMap<String, String>();
//        params.put("action", "regUser");
//        JSONObject reqBody = new JSONObject(params);
//
//        RequestFuture<JSONObject> future = RequestFuture.newFuture();
//        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url, reqBody, future, future);

//        queue.add(request);

//        try {
//
//            JSONObject response = future.get(REQUEST_TIMEOUT, TimeUnit.SECONDS);
//            userID = response.getString("userID");
//            // handle the response
//            Log.d("cislo uzivatele vygenerovane z DB", userID);
//
//        } catch (InterruptedException e) {
//        } catch (ExecutionException e) {
//        } catch (TimeoutException e) {
//        } catch (JSONException e){
//
//        }




        // test of background service of creating user in local DB
        User user = new User(userID);
        CRUDer adapter = new CRUDer(getApplicationContext());

        long id = adapter.saveUserToDB(user);




    }
}
