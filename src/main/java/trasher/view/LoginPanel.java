package trasher.view;

import javax.swing.*;

/**
 * Created by fatfcuk on 15.01.17.
 */
public class LoginPanel extends JPanel{

    private JTextField userField;
    private JTextField passwordField;

    private JLabel userLabel;
    private JLabel passwordLabel;

    private JButton loginButton;



    public LoginPanel(){


        userLabel = new JLabel("username:");
        passwordLabel = new JLabel("password");

        userField = new JTextField(7);
        passwordField = new JTextField(7);

        loginButton = new JButton("login");

        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);


    }
}
