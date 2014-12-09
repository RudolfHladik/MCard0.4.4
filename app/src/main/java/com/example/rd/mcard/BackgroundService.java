package com.example.rd.mcard;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by RD on 21.10.2014.
 */
public class BackgroundService extends IntentService {

    private static final long REQUEST_TIMEOUT = 30;

    public BackgroundService(){
        super("BackgroundService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {


        // gets data from the incoming intent
//        String userName =  intent.getStringExtra("userName");

        // send synchronous request
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://terrell.wz.cz/new_user.php";
        Map<String, String> params = new HashMap<String, String>();
        params.put("action", "regUser");
        JSONObject reqBody = new JSONObject(params);

        RequestFuture<JSONObject> future = RequestFuture.newFuture();
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url, reqBody, future, future);

        queue.add(request);

        try {

            JSONObject response = future.get(REQUEST_TIMEOUT, TimeUnit.SECONDS);

            // handle the response

        } catch (InterruptedException e) {
        } catch (ExecutionException e) {
        } catch (TimeoutException e) {

        }




    }
}
