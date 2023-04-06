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
public class estructuras_de_control3 {
     public static void main(String[] args) {
     
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0  y 10");
        int n1 = leer.nextInt();
        while (n1>10   ){
            System.out.println("Ingrese otro numero");
            n1= leer.nextInt();
        }
        System.out.println("Saliste del bucle !");
     }

    
}
