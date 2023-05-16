/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP VICTUS
 */
public class Registro {
    public usuario[] datos;
    public int indice;
    
    
    public Registro() {
        datos = new usuario[100];
        this.indice = 0;
    
    }
    
    public void agregardatos(usuario persona){
        
        if (indice < datos.length){
            datos[indice] = persona;
            indice++;
        }
        else {
            System.out.println("No hay suficiente espacio para almacenar");
        }
    }
        
    public void ImprimirDatos(){
        System.out.println("Datos registrados:");
        for (int i = 0; i < indice; i++) {
        System.out.println(datos[i].toString());
    }    
        
    }   
    
    
}


