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
public class ejercicio2 {
    //Crear un programa que pida una frase y si esa frase es igual a “eureka” el
    //programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
    //Nota: investigar la función equals() en Java.

    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
        System.out.println("Escriba una frase ");
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
         }else {
            System.out.println("INCARRECTO");
        }
    }
}
