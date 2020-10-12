package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class virtualscenario_home2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtualscenario_home2);
    }

    public void onClickImage(View view) {
        Intent intent = new Intent(this, Homescreen_task4.class);
        startActivity(intent);
    }
}