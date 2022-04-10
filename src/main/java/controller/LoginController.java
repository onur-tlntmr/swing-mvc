package controller;


import dal.IUserDAO;
import utils.ViewHelper;
import view.LoginScreen;
import view.MainScreen;

import javax.swing.*;


public class LoginController extends BaseController {

    private final IUserDAO userDAO;

    private final JTextField txtUserName;
    private final JPasswordField passwordField;


    public LoginController(IUserDAO userDAO, LoginScreen loginScreen) {

        super(userDAO,loginScreen);
        this.userDAO = userDAO;

        this.txtUserName = loginScreen.getTxtUserName();
        this.passwordField = loginScreen.getPasswordField();

        JButton btnSubmit = loginScreen.getBtnSubmit();
        btnSubmit.addActionListener(e -> submitBtnOnClick());

    }


    private void submitBtnOnClick(){
        var userName = txtUserName.getText();
        var password = String.valueOf(passwordField.getPassword());

        var result = userDAO.existUserByUsernameAndPassword(userName,password);

        if(result)
            ViewHelper.changeContentPane(txtUserName,new MainScreen());

        else
            JOptionPane.showMessageDialog(new JFrame(),"Invalid Username or Password!","Error",
                    JOptionPane.ERROR_MESSAGE );


    }





}
