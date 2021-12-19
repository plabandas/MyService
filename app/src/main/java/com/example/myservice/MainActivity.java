package com.example.myservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void StartService(View view) {

        startService(new Intent(MainActivity.this,MyIntentService.class));

    }

    public void StopService(View view) {

        stopService(new Intent(MainActivity.this,MyIntentService.class));

    }
}