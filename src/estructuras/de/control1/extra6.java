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
public class extra6 {
//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo
//de 1.60 mts. y el promedio de estaturas en general
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        
        double sumTotal = 0;
        double sumBelow160 = 0;
        int countBelow160 = 0;
        
        for (int i =1;i<=n;i++){
            System.out.printf("Ingrese la altura de la persona %d en metros: ", i);
            double altura = leer.nextDouble();
            sumTotal += altura;
            
            if (altura < 1.6) {
                sumBelow160 += altura;
                countBelow160++;
            }
        }
        double promedioTotal = sumTotal / n;
        double promedioBelow160 = countBelow160 > 0 ? sumBelow160 / countBelow160 : 0;
        
        System.out.printf("El promedio de estaturas en general es: %.2f mts.\n", promedioTotal);
        System.out.printf("El promedio de estaturas por debajo de 1.60 mts. es: %.2f mts.\n", promedioBelow160);

    }
    
}
