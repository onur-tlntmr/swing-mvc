package view;

import controller.BaseController;

import javax.swing.*;

public abstract class BaseView extends JPanel {

    BaseController controller;

    public void setController(BaseController controller){
        this.controller = controller;
    }

}
