/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * @author HP VICTUS
 */
public class ClassMain {

    final private static LoginForm loginFormView = new LoginForm();
    final private static RegistrationForm registrationFormView = new RegistrationForm();


    public static void main(String[] args) {
        launchApp();
    }

    public static void launchApp() {

        loginFormView.setRegistrationFormView(registrationFormView);
        registrationFormView.setLoginFormView(loginFormView);

        registrationFormView.setVisible(false);
        loginFormView.setVisible(true);
    }

}
