package com.example.android.tourguidep5;

public class Restaurant {
    private String mName;
    private String mAddress;
    private String mPhone;
    private int mPriceRange;
    private String mOpeningHours;


    public Restaurant(String mName, String mAddress, String mPhone, int mPriceRange, String mOpeningHours) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mPriceRange = mPriceRange;
        this.mOpeningHours = mOpeningHours;
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

    public int getmPriceRange() {
        return mPriceRange;
    }

    public String getmOpeningHours() {
        return mOpeningHours;
    }
}
