package com.sdacademy.mvc;

import com.sdacademy.mvc.contoller.GiantController;
import com.sdacademy.mvc.model.Fatigue;
import com.sdacademy.mvc.model.GiantModel;
import com.sdacademy.mvc.model.Health;
import com.sdacademy.mvc.model.Nourshiment;
import com.sdacademy.mvc.view.GiantView;

public class Main {

    public static void main(String[] args) {

        GiantModel giantModel = new GiantModel(Health.DEAD, Fatigue.SLEEPING, Nourshiment.HUNGRUY);
        GiantView giantView = new GiantView();
        GiantController giantController = new GiantController(giantModel, giantView);
        giantController.updateView();
        giantController.setHealth(Health.HEALTHY);
        giantController.updateView();

    }
}
