package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class tagsscreen extends AppCompatActivity {
    private Toolbar toolbar;
    Chip bt1;
    Chip bt2;
    Chip bt3;
    Chip bt4;
    Chip bt5;
    MaterialButton button;
    ChipGroup cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagsscreen);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Create your profile");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        button= findViewById(R.id.button);
        button.setEnabled(false);
        cp=findViewById(R.id.chipgrp);

        bt1=findViewById(R.id.chip_1);
        bt1=cp.findViewById(R.id.chip_1);
        bt2=findViewById(R.id.chip_2);
        bt2=cp.findViewById(R.id.chip_2);
        bt3=findViewById(R.id.chip_3);
        bt3=cp.findViewById(R.id.chip_3);
        bt4=findViewById(R.id.chip_4);
        bt4=cp.findViewById(R.id.chip_4);
        bt5=findViewById(R.id.chip_5);
        bt5=cp.findViewById(R.id.chip_5);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.isChecked() && bt2.isChecked() && bt3.isChecked() && bt4.isChecked() && bt5.isChecked()){
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.isChecked() && bt2.isChecked() && bt3.isChecked() && bt4.isChecked() && bt5.isChecked()){
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.isChecked() && bt2.isChecked() && bt3.isChecked() && bt4.isChecked() && bt5.isChecked()){
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.isChecked() && bt2.isChecked() && bt3.isChecked() && bt4.isChecked() && bt5.isChecked()){
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.isChecked() && bt2.isChecked() && bt3.isChecked() && bt4.isChecked() && bt5.isChecked()){
                    button.setEnabled(true);
                }else{
                    button.setEnabled(false);
                }

            }
        });

    }

    public void reqMatch(View view) {
        Intent intent = new Intent(this, datereques.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.appbar_menu,menu);
        return true;
    }
}