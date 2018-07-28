package com.sdacademy.mvc.model;

public enum Fatigue {

    TIRED("tired"), SLEEPING("sleeping"), LIVELY("VERY ANGRY");

    private String title;

    Fatigue(String title) {
        this.title = title;
    }

}
