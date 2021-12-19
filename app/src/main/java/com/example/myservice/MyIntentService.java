package com.example.myservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class MyIntentService extends IntentService {

    private Handler handler;


    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(MyIntentService.this, "Service Created", Toast.LENGTH_SHORT).show();

        handler = new Handler();
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        // this option is in background

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MyIntentService.this, "Service WokeUp", Toast.LENGTH_SHORT).show();
            }
        },3000);


        }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyIntentService.this, "Service Destroyed", Toast.LENGTH_SHORT).show();
    }
}
