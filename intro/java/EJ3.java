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
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase por teclado: ");
        String cadena = leer.nextLine();
        System.out.println("La frase en minuscula es: " +cadena.toLowerCase());
        System.out.println("La frase en MAYUSCULA es: " +cadena.toUpperCase());
        
        
    }
    
}
