package com.c196.studentprogressapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.c196.studentprogressapp.activities.TermsList;

import java.util.Calendar;

public class Dashboard extends AppCompatActivity {

    Button termsbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.setTitle("Student Dashboard");
        }

        termsbutton = findViewById(R.id.termsbutton);
        termsbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Dashboard.this, TermsList.class);
                startActivity(intent);
            }
        });
    }
}