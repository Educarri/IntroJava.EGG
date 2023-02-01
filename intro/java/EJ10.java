/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro.java;

import java.util.Scanner;

/**
 *
 * @author CARRIZOE
 */
public class EJ10 {

    /**
     * @param args the command line arguments
     */
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial
    */
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int limite, num;
        do {
            System.out.println("Ingrese un valor limite.");
            limite = leer.nextInt();
        } while (limite <= 0);

        int suma = 0;

        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            suma = suma + num;
            System.out.println("La suma es: "+ suma);
        } while (suma <= limite);

        System.out.println("FIN DEL PROGRAMA...");
    }

}
