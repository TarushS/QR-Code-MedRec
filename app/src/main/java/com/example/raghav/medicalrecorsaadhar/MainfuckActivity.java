package com.example.raghav.medicalrecorsaadhar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainfuckActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuck);
        Button buttonOne = findViewById(R.id.go);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activity2Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activity2Intent);
            }
        });
    }
}