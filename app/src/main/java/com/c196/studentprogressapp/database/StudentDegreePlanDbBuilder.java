package com.c196.studentprogressapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.c196.studentprogressapp.dao.AssessmentDAO;
import com.c196.studentprogressapp.dao.CourseDAO;
import com.c196.studentprogressapp.dao.TermDAO;
import com.c196.studentprogressapp.entity.Assessment;
import com.c196.studentprogressapp.entity.Course;
import com.c196.studentprogressapp.entity.Term;

@Database(entities={Term.class, Course.class, Assessment.class}, version=1, exportSchema=false)
public abstract class StudentDegreePlanDbBuilder extends RoomDatabase {
    public abstract TermDAO termDAO();
    public abstract CourseDAO courseDAO();
    public abstract AssessmentDAO assessmentDAO();

    private static volatile StudentDegreePlanDbBuilder INSTANCE;

    static StudentDegreePlanDbBuilder getDatabase(final Context context){
        synchronized (StudentDegreePlanDbBuilder.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        StudentDegreePlanDbBuilder.class, "StudentDegreePlanDatabase")
                        .fallbackToDestructiveMigration().build();
            }
        }
        return INSTANCE;
    }
}
