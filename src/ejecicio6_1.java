
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ejecicio6_1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos nùmeros por favor");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
         String respuesta = "";
        do {
        System.out.println("Elija una opcion");
        System.out.println("1 = sumar");
        System.out.println("2 = restar");
        System.out.println("3 = multiplicar");
        System.out.println("4 = dividir");
        System.out.println("5 = salir");
       

        int opcion = leer.nextInt();
        
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de la division es " + (num1 / num2));
                    break;
                case 5:

                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = leer.next();
                     if (respuesta.equalsIgnoreCase("S")) {
                        break;
                     }
                default: 
                    System.out.println("Opcion Incorrecta");
                    
                    

             }
           
                   
          }  while (!respuesta.equalsIgnoreCase("S"));
        
    
    }

}

    
    

