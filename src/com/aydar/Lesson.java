package com.aydar;

import com.sun.istack.internal.Nullable;

public class Lesson {

    private int mId;
    private Discipline mDiscipline;
    private Teacher mTeacher;
    private Audience mAudience;
    private Group mGroup;

    public Lesson(int id, Discipline discipline, Teacher teacher, Group group, @Nullable Audience audience) {
        mId = id;
        mDiscipline = discipline;
        mTeacher = teacher;
        mGroup = group;
        mAudience = audience;
    }

    public int getId() {
        return mId;
    }

    public Discipline getDiscipline() {
        return mDiscipline;
    }

    public Teacher getTeacher() {
        return mTeacher;
    }

    public Audience getAudience() {
        return mAudience;
    }

    public Group getGroup() {
        return mGroup;
    }
}
