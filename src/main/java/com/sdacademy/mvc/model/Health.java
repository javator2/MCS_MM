package com.sdacademy.mvc.model;

public enum Health {
    HEALTHY("healthu"), WOUNDED("wounded"), DEAD("dead");

    private String title;

    Health(String title) {
        this.title = title;
    }
}
