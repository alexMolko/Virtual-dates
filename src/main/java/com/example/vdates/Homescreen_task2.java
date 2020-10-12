package com.example.vdates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Homescreen_task2 extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen_task2);
        BottomNavigationView btn_bott=findViewById(R.id.bottom_navigation);
        btn_bott.setSelectedItemId(R.id.page_1);
        btn_bott.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page_1:
                        startActivity(new Intent(getApplicationContext(),Homescreen_task2.class));
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_2:
                        startActivity(new Intent(getApplicationContext(),listmatches_screen.class));
                        overridePendingTransition(0,0);
                        break;
                }
                return true;
            }
        });
    }

    public void listmatches(View view) {
        Intent intent = new Intent(this, listmatches_screen.class);
        startActivity(intent);
    }
}