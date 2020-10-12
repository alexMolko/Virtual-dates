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

public class listmatches_screen extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmatches_screen);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Go for a match");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        BottomNavigationView btn_bott=findViewById(R.id.bottom_navigation);
        btn_bott.setSelectedItemId(R.id.page_2);
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

    public void arrangeDate(View view) {
        Intent intent = new Intent(this, scenarioselection.class);
        startActivity(intent);
    }
}