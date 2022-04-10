import controller.LoginController;
import dal.IUserDAO;
import dal.UserDAO;
import utils.ViewHelper;
import view.LoginScreen;

import javax.swing.*;

public class Main extends JFrame {

    private final static int WINDOW_WIDTH = 300;
    private final static int WINDOW_HEIGHT = 300;

    public Main() {

        LoginScreen loginScreen = new LoginScreen();
        IUserDAO userDAO = new UserDAO();

        var loginController = new LoginController(userDAO, loginScreen);
        loginScreen.setController(loginController);

        ViewHelper.centeredWindow(this,WINDOW_WIDTH,WINDOW_HEIGHT);

        getContentPane().add(loginScreen);

    }


    public static void main(String[] args) {

        Main main = new Main();

        main.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
