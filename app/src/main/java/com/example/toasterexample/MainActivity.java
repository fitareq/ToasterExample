package com.example.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasterlibrary.Toaster;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "https://jsonplaceholder.typicode.com/posts";
        Toaster toaster = new Toaster(this, url);
        toaster.geString(new Toaster.VolleyCallBack() {
            @Override
            public void onSuccess(String result) {
                toaster.s(result);
            }

            @Override
            public void onFailure(String msg) {
                toaster.s(msg);
            }
        });



    }
}