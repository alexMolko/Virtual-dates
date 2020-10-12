package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class agreed_datetime extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreed_datetime);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Arrange the date");
        toolbar.setTitleTextColor(Color.WHITE);
    }

    public void confirmscreen(View view) {
        Intent intent = new Intent(this, confirmation_message.class);
        startActivity(intent);
    }

    public void message(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Function not supported yet";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}