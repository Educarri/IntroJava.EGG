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
public class EJ11 {

    /**
     * @param args the command line arguments
     */
    
    /*   EJERCICIO 11
    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:
   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String salir ="";
        System.out.println("Ingrese dos numeros por teclado: ");
        int num1;
        num1 = leer.nextInt();
        int num2;
        num2 = leer.nextInt();
do{
        System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción:");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("La division es: " +(float) (num1 / num2));
                break;
            case 5:
                System.out.println("Esta seguro que desea salir? S/N");
                salir = leer.nextLine();
                if (salir.equalsIgnoreCase("S")){
                    break;
                }else{ 
                    salir="";
                    continue;
                }
            default:
                    System.out.println("Ingrese una opcion valida.");
        }  
} while( !salir.equalsIgnoreCase("N") );
 
        System.out.println("FIN.");

}
    
}
   