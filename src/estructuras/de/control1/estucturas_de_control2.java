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
public class estucturas_de_control2 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero de 1 a 4 para el tipo d motor");
        int n1 =leer.nextInt();
        switch  (n1){
            case 1 :
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2 : 
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default : System.out.println("No existe un valor válido para tipo de bomba");
                 
    }
   }
}
