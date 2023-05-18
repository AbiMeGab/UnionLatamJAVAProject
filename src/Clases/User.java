/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Vector;

/**
 *
 * @author HP VICTUS
 */
public class User {
    
    private String Fullname;
    private int Phonenumber;
    private String email;
    private String password;
    private String confirmPassword;
    

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(int Phonenumber) {
        this.Phonenumber = Phonenumber;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }
   
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    public static Vector Show() {
    return Registration.Show();
    }
    
    public static int verifyNewUser(String usuario) {
        Vector list = Show();
        User Odj;
        for(int i =0; i<list.size();i++){
            Odj = (User) list.elementAt(i);
            if (Odj.getFullname().equalsIgnoreCase(usuario)){
                return 1;
            }
        }
        return -1;
    }
    
    
    public static int verifyLogin(String email,String password){
       Vector list = Show();
       
       User Obj;
       for (int i = 0; i < list.size();i++){
           Obj = (User) list.elementAt(i);
           if (Obj.getEmail().equalsIgnoreCase(email) && Obj.getPassword().equalsIgnoreCase(password)) {
               return i;
           }
          
       }
       return -1;
    }

@Override
    public String toString() {
        return "Nombre completo: " + Fullname + ", Teléfono: " + Phonenumber + ", Email: " + email + ", Password: " + password + ", ConfirPassword: " + confirmPassword;
    }


}


    

    






