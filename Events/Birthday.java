package org.example.Events;

public class Birthday implements SpecialEvents{
    @Override
    public String eventName() {
        return "Zosia's birthday";
    }

    @Override
    public String date() {
        return "30/09/2023";
    }

    @Override
    public String eventType() {
        return "Birthday";
    }

    @Override
    public String reserving() {
        return "Weronika";
    }
}
