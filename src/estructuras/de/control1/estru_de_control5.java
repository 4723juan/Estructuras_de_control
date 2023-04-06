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
public class estru_de_control5 {
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros ");
        int n1 = leer.nextInt();
         int n2 = leer.nextInt();
          int n3 = leer.nextInt();
           int n4 = leer.nextInt();
           
           System.out.print(n1);
           for ( int i=0 ; i< n1 ; i++ ){
               System.out.print("*");
           }
           System.out.println("");
           System.out.print(n2);
           for ( int i=0 ; i< n2 ; i++ ){
               System.out.print("*");
           }
           System.out.println("");
           System.out.print(n3);
           for ( int i=0 ; i< n3 ; i++ ){
               System.out.print("*");
           }
           System.out.println("");
           System.out.print(n4);
           for ( int i=0 ; i< n4 ; i++ ){
               System.out.print("*");
           }
           System.out.println("");
    }
}
