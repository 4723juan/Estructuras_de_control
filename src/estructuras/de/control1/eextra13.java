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
public class eextra13 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor de escalones: ");
        int ingresadoEscalones = leer.nextInt();

        for (int i = 0; i < ingresadoEscalones + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
    

