package com.example.vdates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Homescreen_task3 extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen_task3);
        BottomNavigationView btn_bott=findViewById(R.id.bottom_navigation);
        btn_bott.setSelectedItemId(R.id.page_1);
        btn_bott.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page_1:
                        startActivity(new Intent(getApplicationContext(),Homescreen_taks3_start.class));
                        overridePendingTransition(0,0);
                        break;
                }
                return true;
            }
        });
    }

    public void message(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Function not supported yet";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}