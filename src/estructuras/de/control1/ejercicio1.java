/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.de.control1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio1 {
     public static void main(String[] args) {
     System.out.println("ESCRIBIR UN NUMERO");
     Scanner leer = new Scanner(System.in);
     int num = leer.nextInt();
     
     if (num%2 == 0) {
         System.out.println("El numero es par ");
     }else{
         System.out.println("el numeroes impar ");
     }
            
            
             
             
     
     }
    
}
