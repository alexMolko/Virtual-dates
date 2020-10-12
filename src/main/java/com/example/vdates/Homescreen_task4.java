package com.example.vdates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Homescreen_task4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen_task4);
        BottomNavigationView btn_bott=findViewById(R.id.bottom_navigation);
        btn_bott.setSelectedItemId(R.id.page_1);
        btn_bott.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page_1:
                        startActivity(new Intent(getApplicationContext(),Homescreen_task4.class));
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_4:
                        startActivity(new Intent(getApplicationContext(),results.class));
                        overridePendingTransition(0,0);
                        break;
                }
                return true;
            }
        });
    }

    public void results(View view) {
        Intent intent = new Intent(this, results.class);
        startActivity(intent);
    }
}