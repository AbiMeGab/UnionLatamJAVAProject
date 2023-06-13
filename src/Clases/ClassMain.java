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

    public static void main(String[] args) {
        try {
            launchApp();
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void launchApp() {
        JavaBasicDescriptionCoursesForm javaBasicDescriptionCoursesForm = new JavaBasicDescriptionCoursesForm(appGlobalViews, appGlobalState);
        JSDescriptionCoursesForm jSDescriptionCoursesForm = new JSDescriptionCoursesForm(appGlobalViews, appGlobalState);
        PythonEssentialsDescriptionCoursesForm pythonDescriptionCoursesForm = new PythonEssentialsDescriptionCoursesForm(appGlobalViews, appGlobalState);

        CourseJS courseJS = new CourseJS(appGlobalViews, appGlobalState);
        CourseJava courseJava = new CourseJava(appGlobalViews, appGlobalState);
        CoursePython coursePython = new CoursePython(appGlobalViews, appGlobalState);

        appGlobalViews.setCourseJS(courseJS);
        appGlobalViews.setCourseJava(courseJava);
        appGlobalViews.setCoursePython(coursePython);

        appGlobalViews.setJavaBasicDescriptionCoursesForm(javaBasicDescriptionCoursesForm);
        appGlobalViews.setjSDescriptionCoursesForm(jSDescriptionCoursesForm);
        appGlobalViews.setPythonDescriptionCoursesForm(pythonDescriptionCoursesForm);


        CoursesForm coursesFormView = new CoursesForm(appGlobalViews, appGlobalState);
        appGlobalViews.setCoursesForm(coursesFormView);

        LoginForm loginFormView = new LoginForm(appGlobalViews, appGlobalState);
        RegistrationForm registrationFormView = new RegistrationForm(appGlobalViews, appGlobalState);

        appGlobalViews.setLoginFormView(loginFormView);
        appGlobalViews.setRegistrationFormView(registrationFormView);

        appGlobalViews.getLoginFormView().setVisible(true);
    }
}
