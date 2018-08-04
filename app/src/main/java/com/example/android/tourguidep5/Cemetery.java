package com.example.android.tourguidep5;

public class Cemetery {
    private String mName;
    private String mAddress;
    private String mDescription;
    private String mBurials;

    public Cemetery(String mName, String mAddress, String description, String burials) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mDescription = description;
        this.mBurials = burials;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getBurials() {
        return mBurials;
    }
}
