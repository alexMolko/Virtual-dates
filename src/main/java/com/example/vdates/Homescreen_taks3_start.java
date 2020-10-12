package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homescreen_taks3_start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen_taks3_start);
    }

    public void virtualHome(View view) {
        Intent intent = new Intent(this, VirtualscenarioHome.class);
        startActivity(intent);
    }
}