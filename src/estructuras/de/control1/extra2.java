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
public class extra2 {
 //Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
 //A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
 //A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada
  //variable. Utilizar sólo una variable auxiliar.
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int A = 16;
    int B = 27;
    int C =  56;
    int D = 77;
        System.out.println("A: "+A+" B; "+B+" C: "+C+" D: "+D);
            B=C;C=A;A=D;D=B;
            System.out.println("A: "+A+" B; "+B+" C: "+C+" D: "+D);
                    
    }
}
