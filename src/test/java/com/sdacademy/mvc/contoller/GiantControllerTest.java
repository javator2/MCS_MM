package com.sdacademy.mvc.contoller;

import com.sdacademy.mvc.model.GiantModel;
import com.sdacademy.mvc.model.Health;
import com.sdacademy.mvc.view.GiantView;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class GiantControllerTest {

    @Test
    void setHeath() {
        //given
        final GiantModel model = mock(GiantModel.class);
        final GiantView view = mock(GiantView.class);
        final GiantController controller = new GiantController(model, view);
        verifyZeroInteractions(model, view);
        //when
        for (Health health : Health.values()) {
            System.out.println(health.toString());
            //then
            controller.setHealth(health);
            verify(model).setHealth(health);
        }
    }

    @Test
    void updateView() {
        //given
        final GiantModel model = mock(GiantModel.class);
        final GiantView view = mock(GiantView.class);
        final GiantController controller = new GiantController(model, view);
        verifyZeroInteractions(model, view);
        //when
        controller.updateView();
        verify(view).equals(controller);
        }

    }


