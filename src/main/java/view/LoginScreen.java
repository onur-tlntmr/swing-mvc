package view;

import javax.swing.*;

public class LoginScreen extends BaseView {

    private final JTextField txtUserName = new JTextField(15);
    private final JPasswordField passwordField = new JPasswordField(15);
    private final JButton btnSubmit = new JButton("Submit");

    public LoginScreen() {

        JLabel label = new JLabel();
        JLabel label2 = new JLabel();

        label.setText("Username:");
        label2.setText("Password:");

        this.setLayout(null);


        label.setBounds(10, 30, 100, 20);
        label2.setBounds(10, 65, 100, 20);
        txtUserName.setBounds(80, 30, 150, 20);
        passwordField.setBounds(80, 65, 150, 20);
        btnSubmit.setBounds(110, 100, 80, 20);


        this.add(label);
        this.add(label2);
        this.add(btnSubmit);
        this.add(txtUserName);
        this.add(passwordField);


    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public JTextField getTxtUserName() {
        return txtUserName;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

}
