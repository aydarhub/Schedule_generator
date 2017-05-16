package com.aydar;

public class DBEmulator {

    private Audience[] mAudiences = {
            new Audience(1, "Л215"),
            new Audience(2, "301"),
            new Audience(3, "402"),
            new Audience(4, "218"),
            new Audience(5, "219"),
            new Audience(6, "2к/211"),
            new Audience(7, "Л113"),
            new Audience(8, "306"),
            new Audience(9, "233"),
            new Audience(10, "227"),
            new Audience(11, "401"),
            new Audience(12, "Л201"),
            new Audience(13, "Л315"),
            new Audience(14, "302"),
            new Audience(15, "Л113"),
            new Audience(16, "Л301"),
            new Audience(17, "Л306"),
            new Audience(18, "Л309"),
            new Audience(19, "Л207"),
            new Audience(20, "2к/202"),
            new Audience(21, "234"),
            new Audience(22, "201"),
    };

    private Group[] mGroups = {
            new Group(1, "423К"),
            new Group(2, "324K"),
            new Group(3, "325K"),
            new Group(4, "226K"),
            new Group(5, "227K"),
            new Group(6, "128K"),
            new Group(7, "129K")
    };

    private Teacher[] mTeachers = {
            new Teacher(1, "Нуриев"),
            new Teacher(2, "Ганиева"),
            new Teacher(3, "Габутдинов"),
            new Teacher(4, "Белова"),
            new Teacher(5, "Алимова"),
            new Teacher(6, "Бикмуллина"),
            new Teacher(7, "Газдалиев"),
            new Teacher(8, "Шамсутдинова"),
            new Teacher(9, "Солдатов"),
            new Teacher(10, "Гильфанов"),
            new Teacher(11, "Шуленкова"),
            new Teacher(12, "Ролдугина"),
            new Teacher(13, "Федосеев"),
            new Teacher(14, "Газизова"),
            new Teacher(15, "Гильфанова"),
            new Teacher(16, "Фасхутдинова"),
            new Teacher(17, "Ильина"),
            new Teacher(18, "Мусина"),
            new Teacher(19, "Кипрова"),
            new Teacher(20, "Трапезникова"),
            new Teacher(21, "Грязнов"),
            new Teacher(22, "Набиуллина"),
            new Teacher(23, "Фаизова"),
            new Teacher(24, "Салихова"),
            new Teacher(25, "Цветков"),
            new Teacher(26, "Хаматшин"),
            new Teacher(27, "Габдрахманова"),
            new Teacher(28, "Елькина"),
            new Teacher(29, "Кузнецова")
    };

    private Discipline[] mDisciplines = {
            new Discipline(1, "МДК 0301"),
            new Discipline(2, "Инф.безопасность"),
            new Discipline(3, "Семьеведение"),
            new Discipline(4, "Пакеты прикл.пр."),
            new Discipline(5, "Ин. язык"),
            new Discipline(6, "Физ-ра"),
            new Discipline(7, "Этика дел.отнош."),
            new Discipline(8, "Мат.методы"),
            new Discipline(9, "Основы философии"),
            new Discipline(10, "Химия"),
            new Discipline(11, "МДК 0201"),
            new Discipline(12, "МДК 0101"),
            new Discipline(13, "МДК 0202"),
            new Discipline(14, "МДК 0302"),
            new Discipline(15, "МДК 0102"),
            new Discipline(16, "Основы экономики"),
            new Discipline(17, "Осн.программирования"),
            new Discipline(18, "Архит.комп.сист."),
            new Discipline(19, "Теор.вер. и мат.стат."),
            new Discipline(20, "Эл.мат.лог."),
            new Discipline(21, "Эл.высш.мат."),
            new Discipline(22, "Тат.язык"),
            new Discipline(23, "Операц.сист."),
            new Discipline(24, "МДК 0401"),
            new Discipline(25, "ТСИ"),
            new Discipline(26, "Дискр.матем."),
            new Discipline(27, "Информатика"),
            new Discipline(28, "Экология"),
            new Discipline(29, "География"),
            new Discipline(30, "Физика"),
            new Discipline(31, "Математика"),
            new Discipline(32, "История"),
            new Discipline(33, "Черчение"),
            new Discipline(34, "Обществознание"),
            new Discipline(35, "Литература"),
            new Discipline(36, "ОБЖ")
    };

    private Lesson[] mLessons = {
            //423К
            new Lesson(1, mDisciplines[0], mTeachers[0], mGroups[0], null), // МДК 0301
            new Lesson(2, mDisciplines[1], mTeachers[2], mGroups[0], mAudiences[0]), // Инф. безоп.
            new Lesson(3, mDisciplines[2], mTeachers[3], mGroups[0], mAudiences[1]), // Семьеведение
            new Lesson(4, mDisciplines[3], mTeachers[1], mGroups[0], mAudiences[2]), // ПППр
            new Lesson(5, mDisciplines[4], mTeachers[4], mGroups[0], mAudiences[3]), // Ин. яз.
            new Lesson(6, mDisciplines[5], mTeachers[6], mGroups[0], null), // Физ-ра
            new Lesson(7, mDisciplines[6], mTeachers[7], mGroups[0], null), // Этика
            //324К
            new Lesson(8, mDisciplines[7], mTeachers[1], mGroups[1], mAudiences[2]), // Мат.методы
            new Lesson(9, mDisciplines[8], mTeachers[10], mGroups[1], mAudiences[8]), // Основы философии
            new Lesson(10, mDisciplines[10], mTeachers[9], mGroups[1], mAudiences[7]), // МДК 0201
            new Lesson(11, mDisciplines[5], mTeachers[8], mGroups[1], null), // Физ-ра
            new Lesson(12, mDisciplines[11], mTeachers[2], mGroups[1], mAudiences[0]), // МДК 0101
            new Lesson(13, mDisciplines[12], mTeachers[1], mGroups[1], mAudiences[2]), // МДК 0202
            new Lesson(14, mDisciplines[13], mTeachers[2], mGroups[1], mAudiences[0]), // МДК 0302
            new Lesson(15, mDisciplines[14], mTeachers[2], mGroups[1], mAudiences[0]), // МДК 0102
            new Lesson(16, mDisciplines[15], mTeachers[11], mGroups[1], mAudiences[9]), // Основы экономики
            new Lesson(17, mDisciplines[4], mTeachers[4], mGroups[1], mAudiences[3]), // Ин. яз.
            //325К
            new Lesson(18, mDisciplines[7], mTeachers[1], mGroups[2], mAudiences[2]), // Мат.методы
            new Lesson(19, mDisciplines[8], mTeachers[10], mGroups[2], mAudiences[8]), // Основы философии
            new Lesson(20, mDisciplines[10], mTeachers[9], mGroups[2], mAudiences[7]), // МДК 0201
            new Lesson(21, mDisciplines[5], mTeachers[8], mGroups[2], null), // Физ-ра
            new Lesson(22, mDisciplines[11], mTeachers[2], mGroups[2], mAudiences[0]), // МДК 0101
            new Lesson(23, mDisciplines[12], mTeachers[1], mGroups[2], mAudiences[2]), // МДК 0202
            new Lesson(24, mDisciplines[13], mTeachers[2], mGroups[2], mAudiences[0]), // МДК 0302
            new Lesson(25, mDisciplines[14], mTeachers[2], mGroups[2], mAudiences[0]), // МДК 0102
            new Lesson(26, mDisciplines[15], mTeachers[11], mGroups[2], mAudiences[9]), // Основы экономики
            new Lesson(27, mDisciplines[4], mTeachers[4], mGroups[2], mAudiences[3]), // Ин. яз.
            //226К
            new Lesson(28, mDisciplines[5], mTeachers[12], mGroups[3], null), // Физ-ра
            new Lesson(29, mDisciplines[16], mTeachers[2], mGroups[3], mAudiences[0]), // Основы программирования
            new Lesson(30, mDisciplines[17], mTeachers[13], mGroups[3], mAudiences[10]), // Архит.комп.сист.
            new Lesson(31, mDisciplines[19], mTeachers[1], mGroups[3], mAudiences[2]), // Эл.мат.лог.
            new Lesson(32, mDisciplines[20], mTeachers[16], mGroups[3], mAudiences[13]), // Эл.высш.мат.
            new Lesson(33, mDisciplines[22], mTeachers[2], mGroups[3], mAudiences[0]), // Опер.сист.
            new Lesson(34, mDisciplines[23], mTeachers[2], mGroups[3], mAudiences[0]), // МДК 0401
            new Lesson(35, mDisciplines[24], mTeachers[13], mGroups[3], mAudiences[10]), // ТСИ
            new Lesson(36, mDisciplines[18], mTeachers[1], mGroups[3], mAudiences[2]), // Теор.вер.и мат.стат.
            new Lesson(37, mDisciplines[25], mTeachers[16], mGroups[3], mAudiences[13]), // Дискр.матем.
            new Lesson(38, mDisciplines[4], mTeachers[4], mGroups[3], mAudiences[3]), // Ин. яз.
            new Lesson(39, mDisciplines[21], mTeachers[14], mGroups[3], mAudiences[11]), // Тат. яз.
            //227К
            new Lesson(40, mDisciplines[5], mTeachers[12], mGroups[4], null), // Физ-ра
            new Lesson(41, mDisciplines[16], mTeachers[2], mGroups[4], mAudiences[0]), // Основы программирования
            new Lesson(42, mDisciplines[17], mTeachers[13], mGroups[4], mAudiences[10]), // Архит.комп.сист.
            new Lesson(43, mDisciplines[19], mTeachers[1], mGroups[4], mAudiences[2]), // Эл.мат.лог.
            new Lesson(44, mDisciplines[20], mTeachers[16], mGroups[4], mAudiences[13]), // Эл.высш.мат.
            new Lesson(45, mDisciplines[22], mTeachers[2], mGroups[4], mAudiences[0]), // Опер.сист.
            new Lesson(46, mDisciplines[23], mTeachers[2], mGroups[4], mAudiences[0]), // МДК 0401
            new Lesson(47, mDisciplines[24], mTeachers[13], mGroups[4], mAudiences[10]), // ТСИ
            new Lesson(48, mDisciplines[18], mTeachers[1], mGroups[4], mAudiences[2]), // Теор.вер.и мат.стат.
            new Lesson(49, mDisciplines[25], mTeachers[16], mGroups[4], mAudiences[13]), // Дискр.матем.
            new Lesson(50, mDisciplines[4], mTeachers[4], mGroups[4], mAudiences[3]), // Ин. яз.
            new Lesson(51, mDisciplines[21], mTeachers[14], mGroups[4], mAudiences[11]), // Тат. яз.
            //128К
            new Lesson(52, mDisciplines[4], mTeachers[21], mGroups[5], mAudiences[17]), // Ин. яз.
            new Lesson(53, mDisciplines[26], mTeachers[23], mGroups[5], mAudiences[18]), // Информатика
            new Lesson(54, mDisciplines[27], mTeachers[17], mGroups[5], mAudiences[14]), // Экология
            new Lesson(55, mDisciplines[28], mTeachers[18], mGroups[5], mAudiences[15]), // География
            new Lesson(56, mDisciplines[29], mTeachers[19], mGroups[5], mAudiences[16]), // Физика
            new Lesson(57, mDisciplines[31], mTeachers[20], mGroups[5], null), // История
            new Lesson(58, mDisciplines[30], mTeachers[16], mGroups[5], mAudiences[13]), // Математика
            new Lesson(59, mDisciplines[33], mTeachers[26], mGroups[5], mAudiences[20]), // Обществознание
            new Lesson(60, mDisciplines[34], mTeachers[10], mGroups[5], mAudiences[8]), // Литература
            new Lesson(61, mDisciplines[35], mTeachers[25], mGroups[5], mAudiences[19]), // ОБЖ
            new Lesson(62, mDisciplines[5], mTeachers[24], mGroups[5], null), // Физ-ра
            new Lesson(63, mDisciplines[32], mTeachers[27], mGroups[5], mAudiences[21]), // Черчение
            new Lesson(64, mDisciplines[9], mTeachers[17], mGroups[5], mAudiences[14]), // Химия
            //129К
            new Lesson(52, mDisciplines[4], mTeachers[21], mGroups[5], mAudiences[17]), // Ин. яз.
            new Lesson(53, mDisciplines[26], mTeachers[23], mGroups[5], mAudiences[18]), // Информатика
            new Lesson(54, mDisciplines[27], mTeachers[17], mGroups[5], mAudiences[14]), // Экология
            new Lesson(55, mDisciplines[28], mTeachers[18], mGroups[5], mAudiences[15]), // География
            new Lesson(56, mDisciplines[29], mTeachers[19], mGroups[5], mAudiences[16]), // Физика
            new Lesson(57, mDisciplines[31], mTeachers[20], mGroups[5], null), // История
            new Lesson(58, mDisciplines[30], mTeachers[16], mGroups[5], mAudiences[13]), // Математика
            new Lesson(59, mDisciplines[33], mTeachers[26], mGroups[5], mAudiences[20]), // Обществознание
            new Lesson(60, mDisciplines[34], mTeachers[10], mGroups[5], mAudiences[8]), // Литература
            new Lesson(61, mDisciplines[35], mTeachers[25], mGroups[5], mAudiences[19]), // ОБЖ
            new Lesson(62, mDisciplines[5], mTeachers[24], mGroups[5], null), // Физ-ра
            new Lesson(63, mDisciplines[32], mTeachers[27], mGroups[5], mAudiences[21]), // Черчение
            new Lesson(64, mDisciplines[9], mTeachers[17], mGroups[5], mAudiences[14]) // Химия
    };

    Lesson[] getLessons() {
        return mLessons;
    }
}
