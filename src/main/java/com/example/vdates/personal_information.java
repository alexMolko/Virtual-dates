package com.example.vdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.button.MaterialButton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class personal_information extends AppCompatActivity {
    private Toolbar toolbar;
    final Calendar myCalendar = Calendar.getInstance();
    EditText edittext;
    MaterialButton btn;
    RadioGroup rd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        toolbar=findViewById(R.id.createtoolbar);
        toolbar.setTitle("Create your profile");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        btn= findViewById(R.id.button);
        btn.setEnabled(false);
        edittext= (EditText) findViewById(R.id.editTextDate2);//editTextTextPersonName
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };
        edittext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new DatePickerDialog(personal_information.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.task2:
                        startActivity(new Intent(getApplicationContext(),Homescreen_task2.class));
                        overridePendingTransition(0,0);
                        break;
                    case R.id.task3:
                        startActivity(new Intent(getApplicationContext(),Homescreen_taks3_start.class));
                        overridePendingTransition(0,0);
                        break;
                    case R.id.task4:
                        startActivity(new Intent(getApplicationContext(),Homescreen_task4.class));
                        overridePendingTransition(0,0);
                        break;
                }
                return true;
            }
        });
    rd=findViewById(R.id.radios);
    rd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (!edittext.getText().toString().isEmpty()) {
                btn.setEnabled(true);
            }
        }
    });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.appbar_menu, menu);
        return true;
    }
    private void updateLabel() {
        String myFormat = "dd/mm/yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.FRANCE);
        edittext.setText(sdf.format(myCalendar.getTime()));
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.female:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.male:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void interestScreen(View view) {
        Intent intent = new Intent(this, picturescreen.class);
        startActivity(intent);
    }

    public void validate(View view) {

    }
}
