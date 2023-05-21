/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * @author HP VICTUS
 */
public class ClassMain {

    final private static UserStorageMock userStorage = new UserStorageMock();
    final private static LoginForm loginFormView = new LoginForm();
    final private static RegistrationForm registrationFormView = new RegistrationForm();


    public static void main(String[] args) {
        try {
            launchApp();
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void launchApp() {

        loginFormView.setRegistrationFormView(registrationFormView);
        loginFormView.setUserStorage(userStorage);

        registrationFormView.setLoginFormView(loginFormView);
        registrationFormView.setUserStorage(userStorage);

        registrationFormView.setVisible(false);
        loginFormView.setVisible(true);
    }

}
