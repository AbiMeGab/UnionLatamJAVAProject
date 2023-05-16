/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP VICTUS
 */
public class Record {
    public User[] data;
    public int index;
    
    
    public Record() {
        data = new User[100];
        this.index = 0;
    
    }
    
    public void addData(User person){
        
        if (index < data.length){
            data[index] = person;
            index++;
        }
        else {
            System.out.println("there is not enough space to store");
        }
    }
        
    public void printData(){
        System.out.println("recorded data:");
        for (int i = 0; i < index; i++) {
        System.out.println(data[i].toString());
    }    
        
    }   
    
    
}


