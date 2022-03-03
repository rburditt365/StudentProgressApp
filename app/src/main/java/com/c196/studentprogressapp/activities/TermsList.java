package com.c196.studentprogressapp.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;

import com.c196.studentprogressapp.R;

public class TermsList extends AppCompatActivity {

    ImageButton addButton;
    ScrollView mainScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_list);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setTitle("Degree Plan");
        }

        mainScrollView = (ScrollView)findViewById(R.id.termsList_scrollView_mainList);

        addButton = findViewById(R.id.termsList_button_add);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}