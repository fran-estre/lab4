package com.company;

public class DoorHandle implements IGrabable {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String theyGrabbedMe(String grabber) {
        return "the " + grabber + " grabbed the door handle";
    }
}
