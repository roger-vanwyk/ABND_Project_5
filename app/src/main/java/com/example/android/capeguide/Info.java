package com.example.android.capeguide;

// Created 01/2020 by Roger van Wyk

import android.graphics.drawable.Drawable;

public class Info {

    // ListView item object name
    private String mInfoName;

    //Calculated distance between city center and location
    private String mInfoDistance;

    //Location details
    private String mInfoDetails;

    //Description of location
    private String mInfoDescription;

    //GPS co-ordinates or address of a location
    private String mInfoLocation;

    /**
     * Image resource ID for the object
     **/
    private int mImageDrawable;

    public Info(String infoName, String infoDistance, String infoDetails, String infoDescription, String infoLocation, Drawable imageDrawable) {
        mInfoName = infoName;
        mInfoDistance = infoDistance;
        mInfoDetails = infoDetails;
        mInfoDescription = infoDescription;
        mInfoLocation = infoLocation;
        mImageDrawable = imageDrawable;
    }

    // Display the Name of a location
    public String getInfoName() {
        return mInfoName;
    }

    // Display the Distance of a location
    public String getInfoDistance() {
        return mInfoDistance;
    }

    // Display the Details of a location
    public String getInfoDetails() {
        return mInfoDetails;
    }

    // Display the Description of a location
    public String getInfoDescription() {
        return mInfoDescription;
    }

    // Display GPS co-ordinates or address of a location
    public String getInfoLocation() {
        return mInfoLocation;
    }

    // Display an Image resource of a location
    public Drawable getImageDrawable() {
        return mImageDrawable;
    }
}
