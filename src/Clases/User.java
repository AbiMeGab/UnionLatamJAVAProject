package Clases;

import java.util.Stack;

public class User implements UserModel {

    public String role = "";
    String id = "";
    String fullName = "";
    String phoneNumber = "";
    String email = "";
    String password = "";
    Stack <String> courses;

    public User(String id, String fullName, String phoneNumber, String email, String password, String role) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.role = role;
        this.courses = new Stack<String>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCourseById(String courseId) {
      return courses.stream().filter(course -> course.equals(courseId)).findFirst().orElse(null);
    }
    
    public void addCourse(String courseId) {
      courses.push(courseId);
    }

    public boolean comparePassword(String password) {
        return this.password.equals(password);
    }
}


    

    






