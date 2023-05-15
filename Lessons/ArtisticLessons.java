package org.example.Lessons;

public class ArtisticLessons extends Lesson {
    public ArtisticLessons(String lessonName, String day, String time, int price, int limitChildrenInGroup) {
        super(lessonName, day, time, price, limitChildrenInGroup);
    }

    org.example.Lessons.ArtisticLessons rythmic = new org.example.Lessons.ArtisticLessons("Rytmika", "Środa", "17:00", 40, 10);
    org.example.Lessons.ArtisticLessons painting = new org.example.Lessons.ArtisticLessons("Malarstwo", "Wtorek", "16:00", 30, 20);
    org.example.Lessons.ArtisticLessons piano = new org.example.Lessons.ArtisticLessons("Fortepian", "Czwartek", "16:00", 60, 1);

    public ArtisticLessons(String lessonName, String day, String time, int price, int limitChildrenInGroup, org.example.Lessons.ArtisticLessons rythmic, org.example.Lessons.ArtisticLessons painting, org.example.Lessons.ArtisticLessons piano) {
        super(lessonName, day, time, price, limitChildrenInGroup);
        this.rythmic = rythmic;
        this.painting = painting;
        this.piano = piano;
    }

    public org.example.Lessons.ArtisticLessons getRythmic() {
        return rythmic;
    }

    public void setRythmic(org.example.Lessons.ArtisticLessons rythmic) {
        this.rythmic = rythmic;
    }

    public org.example.Lessons.ArtisticLessons getPainting() {
        return painting;
    }

    public void setPainting(org.example.Lessons.ArtisticLessons painting) {
        this.painting = painting;
    }

    public org.example.Lessons.ArtisticLessons getPiano() {
        return piano;
    }

    public void setPiano(org.example.Lessons.ArtisticLessons piano) {
        this.piano = piano;
    }


}

