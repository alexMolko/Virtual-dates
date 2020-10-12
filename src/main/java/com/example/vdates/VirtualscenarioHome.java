package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VirtualscenarioHome extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtualscenario_home);


    }

    public void onClickImage(View view) {
        Intent intent = new Intent(this, concertScenario.class);
        startActivity(intent);
    }

}