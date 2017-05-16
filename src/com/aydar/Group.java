package com.aydar;

public class Group {

    private int mId;
    private String mName;

    public Group(int id, String name) {
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
