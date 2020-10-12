package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class matchResponse extends AppCompatActivity {
    private ImageView img1,img2,img3,img4,img5;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_response);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Concert scenario");
        toolbar.setTitleTextColor(Color.WHITE);
    }

    public void send(View view) {
        Intent intent = new Intent(this, virtualscenario_home2.class);
        startActivity(intent);
    }

    public void onClickImage(View view) {
        img1= findViewById(R.id.img1);
        img1.setImageResource(R.drawable.filledstar);
        img2= findViewById(R.id.img2);
        img2.setImageResource(R.drawable.filledstar);
        img3= findViewById(R.id.img3);
        img3.setImageResource(R.drawable.filledstar);
        img4= findViewById(R.id.img4);
        img4.setImageResource(R.drawable.filledstar);
        img5= findViewById(R.id.img5);
        img5.setImageResource(R.drawable.filledstar);

    }

    public void message(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Function not supported yet";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}