package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class interestscreen extends AppCompatActivity {
    private Toolbar toolbar;
    MaterialButton btn;
    MaterialButtonToggleGroup tg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interestscreen);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Create your profile");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
         btn= findViewById(R.id.button);
         btn.setEnabled(false);
         tg=findViewById(R.id.preferences_group);
         tg.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
             @Override
             public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                 btn.setEnabled(true);
             }
         });
    }

    public void onRadioButtonClicked(View view) {
    }

    public void tagsScreen(View view) {
        Intent intent = new Intent(this, timeavailability.class);
        startActivity(intent);
    }
}