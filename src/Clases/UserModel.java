package Clases;

public interface UserModel {
    String id = "";
    String fullName = "";
    String phoneNumber = "";
    String email = "";
    String password = "";
    String role = "";

    String getId();

    void setId(String id);

    String getFullName();
    
    void setFullName(String fullName);
    
    String getPhoneNumber();
    
    void setPhoneNumber(String phoneNum);

    String getEmail();

    void setEmail(String email);

    String getPassword();

    void setPassword(String hashPassword);

    String getRole();

    void setRole(String role);

    boolean comparePassword(String password);
}

