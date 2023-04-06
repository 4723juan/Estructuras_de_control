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
public class extra4 {
 //Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero de 1 a 10");
        int num = leer.nextInt();
        switch (num){
            case 1:
                System.out.println("en romano es; I");
                break;
            case 2:
                System.out.println("En romano es II");
                break;
            case 3:
                System.out.println("En romano es III");
                break;
            case 4:
                System.out.println("En romano es IV");
                break;
            case 5:
                System.out.println("En romano es V");
                break;  
            case 6:
                System.out.println("En romano es VI");
                break;
            case 7:
                System.out.println("En romano es VII");
                break;
            case 8:
                System.out.println("En romano es VIII");
                break;
            case 9:
                System.out.println("En romano es IX");
                break;
            case 10:
                 System.out.println("En romano es X");
                break;
             default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");      
        } 
    }  
}
