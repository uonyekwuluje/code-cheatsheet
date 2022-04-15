package com.crudapp.ops.model;

public class Studrec {
    private String mUserID;
    private String mFirstName;
    private String mLastName;

    public Studrec(String mUserID, String mFirstName, String mLastName) {
       this.mUserID = mUserID;
       this.mFirstName = mFirstName;
       this.mLastName = mLastName;
    }

    public String getMUserID() {
        return mUserID;
    }
    public void setMUserID(String mUserID) {
        this.mUserID = mUserID;  
    }

    public String getMFirstName() {
        return mFirstName;
    }
    public void setMFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getMLastName() {
        return mLastName;
    }
    public void setMLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    // Creating String Record
    @Override
    public String toString() {
        return "Student [userid="
            + mUserID
            + ", firstname="
            + mFirstName
            + ", lastname="
            + mLastName + "]"; 
    }

}
