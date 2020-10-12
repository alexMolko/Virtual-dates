package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class confirmation_message extends AppCompatActivity {
    private Toolbar toolbar;
    public int counter;
    TextView textView;
    private TextView txtHour, txtMinute,txtSecond;
    private Handler handler;
    private Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_message);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("You have a date");
        toolbar.setTitleTextColor(Color.WHITE);
        txtHour = (TextView) findViewById(R.id.txtHour);
        txtMinute = (TextView) findViewById(R.id.txtMinute);
        txtSecond = (TextView) findViewById(R.id.txtSeconds);
        countDownStart();
    }
    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "yyyy-MM-dd");
                    // Please here set your event date//YYYY-MM-DD
                    //Date futureDate = dateFormat.parse("2019-5-30");
                    Date currentDate = new Date();
                    Date futureDate =new Date();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(futureDate);
                    calendar.set(Calendar.HOUR_OF_DAY, 21);// for 6 hour
                    calendar.set(Calendar.MINUTE, 30);// for 0 min
                    calendar.set(Calendar.SECOND, 0);// for 0 sec
                    futureDate = calendar.getTime();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtHour.setText("" + String.format("%02d", hours));
                        txtMinute.setText(""
                                + String.format("%02d", minutes));
                        txtSecond.setText(""
                                + String.format("%02d", seconds));

                    } else {
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void gotoHome(View view) {
        Intent intent = new Intent(this, Homescreen_task3.class);
        startActivity(intent);
    }
}