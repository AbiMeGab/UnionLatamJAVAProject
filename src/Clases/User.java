/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP VICTUS
 */
public class User {
    
    public String Fullname;
    public int Phonenumber;
    public String email;
    public String password;
    public String confirmPassword;
    
    
public User (String fullname, int phonenumber, String email, String password, String confirmPassword){
    
    this.Fullname = fullname;
    this.Phonenumber = phonenumber;
    this.email = email;
    this.password = password;
    this.confirmPassword = confirmPassword;
}    
    

    @Override
    public String toString() {
        return "Nombre completo: " + Fullname + ", Teléfono: " + Phonenumber + ", Email: " + email;
    }





}
