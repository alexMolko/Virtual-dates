package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class concertScenario extends AppCompatActivity {
private VideoView videoView;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_scenario);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Concert scenario");
        toolbar.setTitleTextColor(Color.WHITE);
        videoView = (VideoView)findViewById(R.id.video1);
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.concert1;
        Uri uri=Uri.parse(path);//here the path

        videoView.setMediaController(vidControl);
        videoView.setVideoURI(uri);
        videoView.start();
    }

    public void gotoEvaluate(View view) {
        Intent intent = new Intent(this, firstResponse.class);
        startActivity(intent);
    }
}