package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class firstResponse extends AppCompatActivity {
 private  TextInputEditText text;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_response);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Concert scenario");
        toolbar.setTitleTextColor(Color.WHITE);
        text= findViewById(R.id.text1);
        text.requestFocus();

    }

    public void send(View view) {
        Intent intent = new Intent(this, waitingResponse.class);
        startActivity(intent);
    }
}