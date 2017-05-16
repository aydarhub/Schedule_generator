package com.aydar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SchedulePopulation {

    private List<ArrayList<LessonInterval>> mLessonIntervals = new ArrayList<>();
    private DBEmulator mDBEmulator = new DBEmulator();
    private List<Lesson> mLessons = new ArrayList<>();

    public SchedulePopulation(int groupId) {

        for(Lesson lesson : mDBEmulator.getLessons()) {
            if (lesson.getGroup().getId() == groupId) {
                mLessons.add(lesson);
            }
        }

        Random random = new Random();
        for (int i = 0; i < 100000; i++) { // Количество особей
            mLessonIntervals.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) { // Количество дней
                for (int k = 0; k < 6; k++) { // Количество пар за день

                    int lessonNumber = random.nextInt(mLessons.size());
                    mLessonIntervals.get(i).add(new LessonInterval(j, k, mLessons.get(lessonNumber)));
                }
            }
        }
    }

    public List<ArrayList<LessonInterval>> getLessonIntervals() {
        return mLessonIntervals;
    }
}
