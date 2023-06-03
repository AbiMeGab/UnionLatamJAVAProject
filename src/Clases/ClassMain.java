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
    
    final private static CoursesForm coursesForm = new CoursesForm();

    final private static JavaBasicDescriptionCoursesForm javaBasicDescriptionCoursesForm = new JavaBasicDescriptionCoursesForm();
    final private static JSDescriptionCoursesForm jSDescriptionCoursesForm = new JSDescriptionCoursesForm();
    final private static PythonEssentialsDescriptionCoursesForm pythonDescriptionCoursesForm = new PythonEssentialsDescriptionCoursesForm();

    public static void main(String[] args) {
        try {
            launchApp();
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void launchApp() {

        coursesForm.setJavaBasicDescriptionCoursesForm(javaBasicDescriptionCoursesForm);
        coursesForm.setJSDescriptionCoursesForm(jSDescriptionCoursesForm);
        coursesForm.setPythonEssentialsDescriptionCoursesForm(pythonDescriptionCoursesForm);

        javaBasicDescriptionCoursesForm.setCoursesForm(coursesForm);
        jSDescriptionCoursesForm.setCoursesForm(coursesForm);
        pythonDescriptionCoursesForm.setCoursesForm(coursesForm);
        
        loginFormView.setRegistrationFormView(registrationFormView);
        loginFormView.setUserStorage(userStorage);
        loginFormView.setCoursesForm(coursesForm);

        registrationFormView.setLoginFormView(loginFormView);
        registrationFormView.setUserStorage(userStorage);

        coursesForm.setVisible(false);
        registrationFormView.setVisible(false);
        javaBasicDescriptionCoursesForm.setVisible(false);
        jSDescriptionCoursesForm.setVisible(false);
        pythonDescriptionCoursesForm.setVisible(false);
        loginFormView.setVisible(true);
    }

}
