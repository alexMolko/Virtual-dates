package com.example.vdates;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;

public class datereques extends AppCompatActivity {
    private Toolbar toolbar;
    MaterialButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datereques);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Go for a match");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        BottomNavigationView btn_bott=findViewById(R.id.bottom_navigation);
        btn_bott.setSelectedItemId(R.id.page_3);
        btn_bott.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page_1:
                        startActivity(new Intent(getApplicationContext(),Homescreen_task2.class));
                        overridePendingTransition(0,0);
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
         getMenuInflater().inflate(R.menu.appbar_menu,menu);
         return true;
    }
    public void message(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Function not supported yet";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendrequest(View view) {
        btn=findViewById(R.id.button_impact);
        btn.setEnabled(false);
        btn.setBackgroundColor(Color.GRAY);
        Context context = getApplicationContext();
        CharSequence text = "The request was sent successfully";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}