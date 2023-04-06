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
public class ejercicijo5 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.println("MENU de socios");
        System.out.println("A - tipo1");
        System.out.println("B - tipo2");
        System.out.println("C - tipo3");
     
        
        System.out.println("escribir caracter A B o C");
        String caracter = leer.nextLine();
        System.out.println("costo del tratamiento");
        int costo = leer.nextInt();
        
    switch (caracter){
        case "A":
            System.out.println("socio tipo A tiene descuento de 50%---- "+(costo-(costo*0.5)+" $"));
            break;
        case "B": 
            System.out.println("socio tipo B tiene descuento de 35%----- "+(costo-(costo*0.35)+" $"));
            break;
        case "C" :
            System.out.println("socio tipo C tieneno tiene cescuebto----- "+costo +" $");
            break;  
    }
                   
    }
}
