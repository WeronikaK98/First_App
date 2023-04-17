package org.example;

public class ArtisticLessons extends Lesson {
    public ArtisticLessons(String lessonName, String day, String time, int price, int limitChildrenInGroup) {
        super(lessonName, day, time, price, limitChildrenInGroup);
    }
    ArtisticLessons rythmic = new ArtisticLessons("Rytmika", "Środa", "17:00", 40, 10);
    ArtisticLessons painting = new ArtisticLessons("Malarstwo", "Wtorek", "16:00", 30, 20);
    ArtisticLessons piano = new ArtisticLessons("Fortepian", "Czwartek", "16:00", 60, 1);
}

