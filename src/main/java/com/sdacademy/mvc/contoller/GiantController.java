package com.sdacademy.mvc.contoller;

import com.sdacademy.mvc.model.Fatigue;
import com.sdacademy.mvc.model.GiantModel;
import com.sdacademy.mvc.model.Health;
import com.sdacademy.mvc.model.Nourshiment;
import com.sdacademy.mvc.view.GiantView;


public class GiantController {

    private GiantView giantView;
    private  GiantModel giantModel;




    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantView = giantView;
        this.giantModel = giantModel;
    }

    public Health getHealth() {
        return this.giantModel.getHealth();
    }

    public Nourshiment getNourshiment() {
        return this.giantModel.getNourshiment();
    }

    public Fatigue getFatigue() {
        return this.giantModel.getFatigue();
    }





    public void setHealth(Health healthy) {
        this.giantModel.setHealth(healthy);
    }

    public void updateView() {
        giantView.displayGiant(giantModel);
    }
}
