/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * @author HP VICTUS
 */
public class ClassMain {
    final private static AppGlobalState appGlobalState = new AppGlobalState();
    final private static AppGlobalViews appGlobalViews = new AppGlobalViews();

    final private static UserStorageMock userStorage = new UserStorageMock();
//    final private static LoginForm loginFormView = new LoginForm();
//    final private static RegistrationForm registrationFormView = new RegistrationForm();
    
//    final private static CoursesForm coursesForm = new CoursesForm(appGlobalViews,appGlobalState);

//     private static JavaBasicDescriptionCoursesForm javaBasicDescriptionCoursesForm = null;
//     private static JSDescriptionCoursesForm jSDescriptionCoursesForm = null;
//     private static PythonEssentialsDescriptionCoursesForm pythonDescriptionCoursesForm = null;

    public static void main(String[] args) {
        try {
            launchApp();
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void launchApp() {
        JavaBasicDescriptionCoursesForm javaBasicDescriptionCoursesForm = new JavaBasicDescriptionCoursesForm(appGlobalViews,appGlobalState);
        JSDescriptionCoursesForm jSDescriptionCoursesForm = new JSDescriptionCoursesForm(appGlobalViews,appGlobalState);
        PythonEssentialsDescriptionCoursesForm pythonDescriptionCoursesForm = new PythonEssentialsDescriptionCoursesForm(appGlobalViews,appGlobalState);
        
        appGlobalViews.setJavaBasicDescriptionCoursesForm(javaBasicDescriptionCoursesForm);
        appGlobalViews.setjSDescriptionCoursesForm(jSDescriptionCoursesForm);
        appGlobalViews.setPythonDescriptionCoursesForm(pythonDescriptionCoursesForm);
        
        
        CoursesForm coursesFormView = new CoursesForm(appGlobalViews,appGlobalState);
        appGlobalViews.setCoursesForm(coursesFormView);
        
        LoginForm loginFormView = new LoginForm(appGlobalViews,appGlobalState);
        RegistrationForm registrationFormView = new RegistrationForm(appGlobalViews,appGlobalState);
        
        appGlobalViews.setLoginFormView(loginFormView);
        appGlobalViews.setRegistrationFormView(registrationFormView);
        
        appGlobalViews.getLoginFormView().setVisible(true);
        
        
        
        
        
        
//        coursesForm.setJavaBasicDescriptionCoursesForm(javaBasicDescriptionCoursesForm);
//        coursesForm.setJSDescriptionCoursesForm(jSDescriptionCoursesForm);
//        coursesForm.setPythonEssentialsDescriptionCoursesForm(pythonDescriptionCoursesForm);
        
        
//        coursesForm
//        CoursesForm coursesFormView = new CoursesForm(appGlobalViews,appGlobalState);
//        appGlobalViews.setCoursesForm(coursesFormView);

//        javaBasicDescriptionCoursesForm.setCoursesForm(coursesForm);
//        jSDescriptionCoursesForm.setCoursesForm(coursesForm);
//        pythonDescriptionCoursesForm.setCoursesForm(coursesForm);
//        
//        loginFormView.setRegistrationFormView(registrationFormView);
//        loginFormView.setUserStorage(userStorage);
//        loginFormView.setCoursesForm(coursesForm);
//        loginFormView.setAppGlobalState(appGlobalState);
//        
//        
//        jSDescriptionCoursesForm.setAppGlobalState(appGlobalState);
//        javaBasicDescriptionCoursesForm.setAppGlobalState(appGlobalState);
//        pythonDescriptionCoursesForm.setAppGlobalState(appGlobalState);
//
//        registrationFormView.setLoginFormView(loginFormView);
//        registrationFormView.setUserStorage(userStorage);
//
//        coursesForm.setVisible(false);
//        registrationFormView.setVisible(false);
//        javaBasicDescriptionCoursesForm.setVisible(false);
//        jSDescriptionCoursesForm.setVisible(false);
//        pythonDescriptionCoursesForm.setVisible(false);
//        loginFormView.setVisible(true);
    }
}
