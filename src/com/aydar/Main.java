package com.aydar;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SchedulePopulation schedulePopulation = new SchedulePopulation(1);

        List<LessonInterval> lessons = schedulePopulation.getLessonIntervals().get(0);

        for (LessonInterval lessonInterval : lessons) {
            Lesson lesson = lessonInterval.getLesson();
            System.out.println(lesson.getId() + " | " + lesson.getGroup().getName() + " | "
                    + lesson.getDiscipline().getName() + " | " + lesson.getTeacher().getName()
                    + " | " + (lesson.getAudience() != null ? lesson.getAudience().getNumber() : "Неизвестно"));
        }

    }
}
