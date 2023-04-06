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
public class extra7 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a leer: ");
        int n = leer.nextInt();

        int i = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
          do {
            System.out.printf("Ingrese el número %d: ", i + 1);
            int num = leer.nextInt();

            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);

            i++;
        } while (i < n);
           double promedio = (double) sum / n;

        System.out.printf("Valor mínimo: %d\n", min);
        System.out.printf("Valor máximo: %d\n", max);
        System.out.printf("Promedio: %.2f\n", promedio);
     }
}
