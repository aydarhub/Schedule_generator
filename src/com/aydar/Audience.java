package com.aydar;

public class Audience {

    private int mId;
    private String mNumber;

    public Audience(int id, String number) {
        mId = id;
        mNumber = number;
    }

    public int getId() {
        return mId;
    }

    public String getNumber() {
        return mNumber;
    }
}
