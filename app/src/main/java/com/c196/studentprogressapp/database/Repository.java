package com.c196.studentprogressapp.database;

import android.app.Application;

import com.c196.studentprogressapp.dao.AssessmentDAO;
import com.c196.studentprogressapp.dao.CourseDAO;
import com.c196.studentprogressapp.dao.TermDAO;
import com.c196.studentprogressapp.entity.Assessment;
import com.c196.studentprogressapp.entity.Course;
import com.c196.studentprogressapp.entity.Term;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private TermDAO mTermDAO;
    private CourseDAO mCourseDAO;
    private AssessmentDAO mAssessmentDAO;

    private List<Term> mAllTerms;
    private List<Course> mAllCourses;
    private List<Assessment> mAllAssessments;

    private static int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public Repository(Application application){
        StudentDegreePlanDbBuilder db = StudentDegreePlanDbBuilder.getDatabase(application);
        mTermDAO = db.termDAO();
        mCourseDAO = db.courseDAO();
        mAssessmentDAO = db.assessmentDAO();
    }

    public void insert(Term term){
        databaseExecutor.execute(()-> mTermDAO.insert(term));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void insert(Course course){
        databaseExecutor.execute(()-> mCourseDAO.insert(course));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void insert(Assessment assessment){
        databaseExecutor.execute(()-> mAssessmentDAO.insert(assessment));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void update(Term term){
        databaseExecutor.execute(()-> mTermDAO.update(term));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void update(Course course){
        databaseExecutor.execute(()-> mCourseDAO.update(course));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void update(Assessment assessment){
        databaseExecutor.execute(()-> mAssessmentDAO.update(assessment));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void delete(Term term){
        databaseExecutor.execute(()-> mTermDAO.delete(term));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void delete(Course course){
        databaseExecutor.execute(()-> mCourseDAO.delete(course));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void delete(Assessment assessment){
        databaseExecutor.execute(()-> mAssessmentDAO.delete(assessment));

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
