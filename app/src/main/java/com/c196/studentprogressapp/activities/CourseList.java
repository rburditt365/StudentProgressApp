package com.c196.studentprogressapp.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ScrollView;

import com.c196.studentprogressapp.R;

public class CourseList extends AppCompatActivity {

    ImageButton addButton;
    ScrollView mainListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setTitle("Courses");
        }

        mainListView = (ScrollView)findViewById(R.id.courseList_scrollView_mainList);

        addButton = findViewById(R.id.courseList_button_add);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}