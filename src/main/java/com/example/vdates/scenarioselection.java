package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;


public class scenarioselection extends AppCompatActivity {

    private MaterialCardView cardView1;
    private MaterialCardView cardView2;
    private MaterialCardView cardView3;
    private MaterialCardView cardView4;
    private MaterialCardView cardView5;
    private MaterialCardView cardView6;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenarioselection);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Arrange the date");
        toolbar.setTitleTextColor(Color.WHITE);
        cardView1 = findViewById(R.id.scn1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView1.toggle();
            }
        });

        cardView2 = findViewById(R.id.scn2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView2.toggle();
            }
        });

        cardView3 = findViewById(R.id.scn3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView3.toggle();
            }
        });

        cardView4 = findViewById(R.id.scn4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView4.toggle();
            }
        });

        cardView5 = findViewById(R.id.scn5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView5.toggle();
            }
        });

        cardView6 = findViewById(R.id.scn6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView6.toggle();
            }
        });
    }

    public void schedule(View view) {
        Intent intent = new Intent(this, agreed_datetime.class);
        startActivity(intent);
    }
}
