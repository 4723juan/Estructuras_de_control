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
public class EstructurasDeControl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        System.out.println("Ingrese 2 Numeros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        if ( n1>25 && n2>25  )
        { System.out.println("Ambos numeros son mayores a 25");
        } else if (n1>25){System.out.println("El primer numero es major 25");}
        else if (n2>25){
            System.out.println("El segundo es major a 25");
        } else {
            System.out.println("Ninguno es mayor a 25");
        }
    }
    
}
