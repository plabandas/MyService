package com.example.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    private Handler handler;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {

        super.onCreate();
        Toast.makeText(this, "On Creat Called",Toast.LENGTH_SHORT).show();

        handler= new Handler() ;

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MyService.this, "Service WokeUp", Toast.LENGTH_SHORT).show();
            }
        },7000);
        

        Toast.makeText(this, "Servicing is Running", Toast.LENGTH_SHORT).show();

        stopSelf();   //Stop service automatic after working
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {

        Toast.makeText(this,"OnDestroy Called",Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }
}