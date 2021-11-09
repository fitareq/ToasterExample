package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Toaster {


    Context context;
    RequestQueue requestQueue;
    String url;
    public Toaster(Context context, String url)
    {
        this.context = context;
        this.url = url;
        requestQueue = Volley.newRequestQueue(context);

    }
    public void s(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }

    public void geString(final VolleyCallBack callBack){
        //String url = "https://jsonplaceholder.typicode.com/post";
        StringRequest stringRequest = new StringRequest(Request.Method.GET,url, callBack::onSuccess, error -> callBack.onFailure(error.toString()) );
        requestQueue.add(stringRequest);
    }


    public interface VolleyCallBack{
        void onFailure(String msg);
        void onSuccess(String response);

    }
}
