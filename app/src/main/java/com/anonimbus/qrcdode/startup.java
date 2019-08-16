
package com.anonimbus.qrcdode;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;


public class startup extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method is used so that your splash activity 
        //can cover the entire screen. 

        setContentView(R.layout.startup);
        //this will bind your MainActivity.class file with activity_main. 

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(startup.this,
                        MainfuckActivity.class);
                //Intent is used to switch from one activity to another. 

                startActivity(i);
                //invoke the SecondActivity. 

                finish();
                //the current activity will get finished. 
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
} 