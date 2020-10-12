package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class timeavailability extends AppCompatActivity {

    private Toolbar toolbar;
    MaterialButtonToggleGroup tg;
    MaterialButton bt1;
    MaterialButton bt2;
    MaterialButton bt3;
    MaterialButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeavailability);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Create your profile");
        toolbar.setTitleTextColor(Color.WHITE);
        tg=findViewById(R.id.preferences_group2);
        button= findViewById(R.id.button);
        button.setEnabled(false);
        bt1=findViewById(R.id.btn_Fri);
        bt2=findViewById(R.id.btn_Sat);
        bt3=findViewById(R.id.btn_Sun);
        tg.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (bt1.isChecked() && bt2.isChecked() && bt3.isChecked() ){
                    button.setEnabled(true);
                }else {
                    button.setEnabled(false);
                }
            }
        });
    }

    public void tagsScreen(View view) {
        Intent intent = new Intent(this, tagsscreen.class);
        startActivity(intent);
    }
}