package org.example;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class SportActivity extends Lesson {
    public SportActivity(String lessonName, String day, String time, int price, int limitChildrenInGroup) {
        super(lessonName, day, time, price, limitChildrenInGroup);
    }
    SportActivity acrobatic = new SportActivity("Akrobatyka", "Piątek", "17:00", 40, 10);
    SportActivity gimnastic = new SportActivity("Gimnastyka", "Wtorek", "18:00", 45, 15);

    public SportActivity getAcrobatic() {
        return acrobatic;
    }

    public void setAcrobatic(SportActivity acrobatic) {
        this.acrobatic = acrobatic;
    }

    public SportActivity getGimnastic() {
        return gimnastic;
    }

    public void setGimnastic(SportActivity gimnastic) {
        this.gimnastic = gimnastic;
    }

//    List sport = new java.util.LinkedList();
//    {
//        list.add(acrobatic);
//        list.add(gimnastic);
//    }
}