package com.example.android.tourguidep5;

public class Shelter {
    private String mName;
    private String mAddress;
    private String mPhone;
    private String mUrl;
    private String mEmail;


    public Shelter(String mName, String mAddress, String mPhone, String mUrl, String mEmail) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mUrl = mUrl;
        this.mEmail = mEmail;
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

    public String getmUrl() {
        return mUrl;
    }

    public String getmEmail() {
        return mEmail;
    }
}

