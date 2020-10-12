package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;


public class waitingResponse extends AppCompatActivity {
    ProgressBar prog;
    private Handler handler;
    private Runnable runnable;
    TextView text2,text3,title;
    MaterialCardView card;
    LinearLayout lay;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_response);
        prog =(ProgressBar) findViewById(R.id.loading_spinner);
        text2= findViewById(R.id.textname2);
        card= findViewById(R.id.secondUser);
        card.setVisibility(View.INVISIBLE);
        text3= findViewById(R.id.secResp);
        text3.setVisibility(View.INVISIBLE);
        lay=findViewById(R.id.confirmationLay);
        lay.setVisibility(View.INVISIBLE);
        title=findViewById(R.id.textView2);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Concert scenario");
        toolbar.setTitleTextColor(Color.WHITE);
        //countDownStart();
        new Task1().execute();

    }

    public void send(View view) {
        Intent intent = new Intent(this, matchResponse.class);
        startActivity(intent);
    }

    public void message(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Function not supported yet";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    class   Task1 extends AsyncTask<String,Void,String>{
        @Override
        protected void onPreExecute() {
            prog.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(String s) {
        prog.setVisibility(View.GONE);
           /* Intent intent = new Intent(waitingResponse.this, matchResponse.class);
            startActivity(intent);*/
           card.setVisibility(View.VISIBLE);
           text3.setVisibility(View.VISIBLE);
            lay.setVisibility(View.VISIBLE);
            title.setText("Do you agree with the response?");
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "";
        }
    }
}