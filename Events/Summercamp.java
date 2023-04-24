package org.example.Events;

public class Summercamp implements SpecialEvents{
    @Override
    public String eventName() {
        return "Summercamp 2023";
    }

    @Override
    public String date() {
        return "1-20/07/2023";
    }

    @Override
    public String eventType() {
        return "Summercamp";
    }

    @Override
    public String reserving() {
        return "Own event";
    }
}
