package com.example.android.tourguidep5;

public class Church {
    private String mName;
    private String mAddress;
    private String mPhone;
    private String mDescription;
    private int mYearBuilt;
    private int mImageResourceId;

    public Church(String mName, String mAddress, String mPhone, String mDescription, int mYearBuilt, int mImageResourceId) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mDescription = mDescription;
        this.mYearBuilt = mYearBuilt;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmYearBuilt() {
        return mYearBuilt;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}

