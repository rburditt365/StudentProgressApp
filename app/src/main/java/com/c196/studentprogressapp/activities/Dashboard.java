package com.c196.studentprogressapp.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.c196.studentprogressapp.R;
import com.c196.studentprogressapp.database.Repository;
import com.c196.studentprogressapp.entity.Term;

public class Dashboard extends AppCompatActivity {

    Button termsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.setTitle("Student Dashboard");
        }

        termsButton = findViewById(R.id.termsButton);
        termsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Dashboard.this, TermsList.class);
                startActivity(intent);
            }
        });

        start();
    }

    public void start(){
        Repository repo = new Repository(getApplication());
        Term term1 = new Term(1, "Awesome Term 1");
        repo.insert(term1);
    }
}