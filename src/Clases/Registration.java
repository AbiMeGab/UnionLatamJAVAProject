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
public class Registration {
    
    private static Vector<User> users = new Vector<User>();
    
    
    public static void add (User Person) {
        users.addElement(Person);
        
        
    }
        
    public static Vector Show(){
     return users;   
    }
   /* public void printData(){
        System.out.println("recorded data:");
        for (int i = 0; i < index; i++) {
        System.out.println(Users[i].toString());
    }    
        
    }*/
    
    
}


