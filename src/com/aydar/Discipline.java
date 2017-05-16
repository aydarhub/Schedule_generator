package com.aydar;

public class Discipline {

    private int mId;
    private String mName;

    public Discipline(int id, String name) {
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
