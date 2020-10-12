package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;

public class picturescreen extends AppCompatActivity {
    private Toolbar toolbar;
    MaterialButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picturescreen);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Create your profile");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        btn= findViewById(R.id.button);
        btn.setEnabled(false);
    }

    public void takePic(View view) {
        ImageView iv= (ImageView)findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.manprofile);
        btn.setEnabled(true);
    }

    public void interestScreen2(View view) {
        Intent intent = new Intent(this, interestscreen.class);
        startActivity(intent);
    }
}