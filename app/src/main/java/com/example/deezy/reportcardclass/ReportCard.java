package com.example.deezy.reportcardclass;

/**
 * Created by DEEZY on 09/05/2017.
 */

public class ReportCard {
    private String mStudent;
    private String mEnglish;
    private String mMaths;
    private String mScience;
    private String mPE;
    private String mICT;

    // To add a Report Card you enter the student name and their initial grades.
    public ReportCard(String student, String english, String maths, String science, String PE, String ICT) {
        mStudent = student;
        mEnglish = english;
        mMaths = maths;
        mScience = science;
        mPE = PE;
        mICT = ICT;
    }

    // These methods return whatever information is asked
    public String getmStudent() {
        return mStudent;
    }

    public String getmEnglish() {
        return mEnglish;
    }

    public String getmMaths() {
        return mMaths;
    }

    public String getmScience() {
        return mScience;
    }

    public String getmPE() {
        return mPE;
    }

    public String getmICT() {
        return mICT;
    }

    public void setmStudent(String mStudent) {
        this.mStudent = mStudent;
    }

    public void setmEnglish(String mEnglish) {
        this.mEnglish = mEnglish;
    }

    public void setmMaths(String mMaths) {
        this.mMaths = mMaths;
    }

    public void setmScience(String mScience) {
        this.mScience = mScience;
    }

    public void setmPE(String mPE) {
        this.mPE = mPE;
    }

    public void setmICT(String mICT) {
        this.mICT = mICT;
    }

    public String toString() {
        return "Student: " + mStudent + "\n English: " + mEnglish + "\n Maths: " + mMaths + "\n Science: " + mScience + "\n PE: " + mPE + "\n ICT: " + mICT;
    }
}
