package com.example.deezy.reportcardclass;

/**
 * Created by DEEZY on 09/05/2017.
 */

public class ReportCard {
    private String mStudent;
    public String mEnglish;
    public String mMaths;
    public String mScience;
    public String mPE;
    public String mICT;

// To add a Report Card you enter the student name and their initial grades.
    public ReportCard (String student, String english, String maths, String science, String PE, String ICT){
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

    public String getmEnglish(){
        return mEnglish;
    }
    public String getmMaths(){
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

    // The following methods allow the user to input new grades.

    public  String updatemEnglish(String newEnglish){
        mEnglish = newEnglish;
        return mEnglish;
    }

    public String updatemMaths(String newMaths){
        mMaths = newMaths;
        return mMaths;
    }

    public String updatemScience(String newScience){
        mScience = newScience;
        return mScience;
    }
    public String updatemPE(String newPE){
        mPE = newPE;
        return mPE;
    }
    public String updatemICT(String newICT){
        mICT = newICT;
        return mICT;
    }


}
