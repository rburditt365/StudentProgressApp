package com.c196.studentprogressapp.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "assessments")
public class Assessment {
    @PrimaryKey(autoGenerate = true)

    int assessmentId;
    String assessmentName;

    public Assessment(int assessmentId, String assessmentName) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
    }

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    @Override
    public String toString() {
        return "Assessment{" + "assessmentId=" + assessmentId +
                ", assessmentName='" + assessmentName + '\'' + '}';
    }
}
