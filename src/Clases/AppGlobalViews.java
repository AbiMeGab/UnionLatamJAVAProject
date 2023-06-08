package Clases;

public class AppGlobalViews {

    private UserStorageMock userStorage = new UserStorageMock();
    private LoginForm loginFormView = new LoginForm();
    private RegistrationForm registrationFormView = new RegistrationForm();

    private CoursesForm coursesForm = new CoursesForm();

    private JavaBasicDescriptionCoursesForm javaBasicDescriptionCoursesForm = new JavaBasicDescriptionCoursesForm();
    private JSDescriptionCoursesForm jSDescriptionCoursesForm = new JSDescriptionCoursesForm();
    private PythonEssentialsDescriptionCoursesForm pythonDescriptionCoursesForm = new PythonEssentialsDescriptionCoursesForm();

      public UserStorageMock getUserStorage() {
            return userStorage;
      }

      public void setUserStorage(UserStorageMock userStorage) {
            this.userStorage = userStorage;
      }

      public LoginForm getLoginFormView() {
            return loginFormView;
      }

      public void setLoginFormView(LoginForm loginFormView) {
            this.loginFormView = loginFormView;
      }

      public RegistrationForm getRegistrationFormView() {
            return registrationFormView;
      }

      public void setRegistrationFormView(RegistrationForm registrationFormView) {
            this.registrationFormView = registrationFormView;
      }

      public CoursesForm getCoursesForm() {
            return coursesForm;
      }

      public void setCoursesForm(CoursesForm coursesForm) {
            this.coursesForm = coursesForm;
      }

      public JavaBasicDescriptionCoursesForm getJavaBasicDescriptionCoursesForm() {
            return javaBasicDescriptionCoursesForm;
      }

      public void setJavaBasicDescriptionCoursesForm(JavaBasicDescriptionCoursesForm javaBasicDescriptionCoursesForm) {
            this.javaBasicDescriptionCoursesForm = javaBasicDescriptionCoursesForm;
      }

      public JSDescriptionCoursesForm getjSDescriptionCoursesForm() {
            return jSDescriptionCoursesForm;
      }

      public void setjSDescriptionCoursesForm(JSDescriptionCoursesForm jSDescriptionCoursesForm) {
            this.jSDescriptionCoursesForm = jSDescriptionCoursesForm;
      }

      public PythonEssentialsDescriptionCoursesForm getPythonDescriptionCoursesForm() {
            return pythonDescriptionCoursesForm;
      }

      public void setPythonDescriptionCoursesForm(PythonEssentialsDescriptionCoursesForm pythonDescriptionCoursesForm) {
            this.pythonDescriptionCoursesForm = pythonDescriptionCoursesForm;
      }
}
