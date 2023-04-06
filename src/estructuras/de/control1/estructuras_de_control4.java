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
public class estructuras_de_control4 {
     public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros , si es  0 se parara el programa");
        int suma;
        suma = 0;
        int n1 = leer.nextInt();
        do {
            if (n1>0){suma = suma + n1;
            }
            System.out.println("Ingresa otro numero");
             n1= leer.nextInt();
        } while ( n1 > 0  ) ;
      
       
        System.out.println("La suma total es de " + suma);
     
     }
}
