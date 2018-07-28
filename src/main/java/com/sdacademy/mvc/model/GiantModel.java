package com.sdacademy.mvc.model;

public class GiantModel {

    private Health health;
    private Fatigue fatigue;
    private Nourshiment nourshiment;


    public GiantModel(Health health, Fatigue fatigue, Nourshiment nourshiment) {
        this.health = health;
        this.fatigue = fatigue;
        this.nourshiment = nourshiment;
    }

    public Health getHealth() {
        return health;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public Nourshiment getNourshiment() {
        return nourshiment;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public void setNourshiment(Nourshiment nourshiment) {
        this.nourshiment = nourshiment;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", nourshiment=" + nourshiment +
                '}';
    }
}
