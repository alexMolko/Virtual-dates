package com.example.vdates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class results extends AppCompatActivity {
    private ViewPager pager;
    private LinearLayout linearLayout;
    private sliderAdapter sliderAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Results");
        toolbar.setTitleTextColor(Color.WHITE);
        pager= findViewById(R.id.pager);
        sliderAdapter= new sliderAdapter(this);
        pager.setAdapter(sliderAdapter);
        BottomNavigationView btn_bott=findViewById(R.id.bottom_navigation);
        btn_bott.setSelectedItemId(R.id.page_4);
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
}