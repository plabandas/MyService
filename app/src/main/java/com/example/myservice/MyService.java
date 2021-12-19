package com.example.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {

        Toast.makeText(this, "On Creat Called",Toast.LENGTH_SHORT).show();

        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

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