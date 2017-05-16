package com.aydar;

public class LessonInterval {

    private int mDay;
    private int mNumber;
    private Lesson mLesson;

    public LessonInterval(int day, int number, Lesson lesson) {

        mDay = day;
        mNumber = number;
        mLesson = lesson;
    }

    public int getDay() {
        return mDay;
    }

    public int getNumber() {
        return mNumber;
    }

    public Lesson getLesson() {
        return mLesson;
    }
}
