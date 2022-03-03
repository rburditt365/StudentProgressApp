package com.c196.studentprogressapp.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "terms")
public class Term {
    @PrimaryKey(autoGenerate = true)

    private int termId;
    private String termName;

    public Term(int termId, String termName) {
        this.termId = termId;
        this.termName = termName;
    }

    @Override
    public String toString() {
        return "Term{" + "termId=" + termId + ", termName='" + termName + '\'' + '}';
    }

    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }
}
