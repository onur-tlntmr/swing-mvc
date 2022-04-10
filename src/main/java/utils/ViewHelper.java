package utils;

import view.BaseView;

import javax.swing.*;
import java.awt.*;

public class ViewHelper {

    public static void changeContentPane(Component childComponent, BaseView newView) {

        JRootPane rootPane = SwingUtilities.getRootPane(childComponent);

        rootPane.getContentPane().removeAll();
        rootPane.getContentPane().add(newView);

        rootPane.getContentPane().validate();
        rootPane.getContentPane().repaint();
    }

    public static void centeredWindow(JFrame jFrame, int windowWidth, int windowHeight) {

        var dim = Toolkit.getDefaultToolkit().getScreenSize();

        var x = dim.width / 2 - windowWidth / 2;
        var y = dim.height / 2 - windowHeight / 2;

        jFrame.setLocation(x, y);
    }


}
