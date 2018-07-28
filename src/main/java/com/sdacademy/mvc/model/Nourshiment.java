package com.sdacademy.mvc.model;

public enum Nourshiment {

    HUNGRUY("hungry"), MOARHUNGRY("still hungr, even moaaarrr"), THINKING("thinking about food"), FULL("never gone get full ;( ");

    private String title;

    Nourshiment(String title){
        this.title = title;
    }

}
