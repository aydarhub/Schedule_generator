package com.aydar;

public class Teacher {

    private int mId;
    private String mName;

    public Teacher(int id, String name) {
        mId = id;
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }
}
