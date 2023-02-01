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
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Crear un programa que dado un numero determine si es par o impar.
    */
    public static void main(String[] args) {
        

        System.out.println("Ingres un numero para determinar si es par o impar");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El numero es par: ");
        }else{
            System.out.println("El numero es impar: ");
        }
    }
    
}
