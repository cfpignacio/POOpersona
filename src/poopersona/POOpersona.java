/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopersona;

/**
 *
 * @author Notebook
 */
public class POOpersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear obj Persona
        Persona p,p2;
        
        p = new Persona();
        
        p.dni = 20345644;
        p.nombre = "Gonzalo";
        
        
        p2 = new Persona();
        p2.dni = 11111111;
        p2.nombre = "Agustin";
       
    
        
        
        System.out.println("El nombre de p1: " + p.nombre);
        System.out.println("El dni es: " + p.dni);
        
        
         System.out.println("El nombre de p2: " + p2.nombre);
        System.out.println("El dni es: " + p2.dni);
        
    }
    
}
