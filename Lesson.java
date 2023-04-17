package org.example;

public class Lesson {
    String lessonName;
    String day;
    String time;
    int price;
    int limitChildrenInGroup;

    public Lesson(String lessonName, String day, String time, int price, int limitChildrenInGroup) {
        this.lessonName = lessonName;
        this.day = day;
        this.time = time;
        this.price = price;
        this.limitChildrenInGroup = limitChildrenInGroup;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLimitChildrenInGroup() {
        return limitChildrenInGroup;
    }

    public void setLimitChildrenInGroup(int limitChildrenInGroup) {
        this.limitChildrenInGroup = limitChildrenInGroup;
    }
}
