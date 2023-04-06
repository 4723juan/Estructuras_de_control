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
public class extra1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tiempo en minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;

        System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
    }
}
    

