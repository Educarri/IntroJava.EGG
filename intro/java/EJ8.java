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
public class EJ8 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.
   
    */
    public static void main(String[] args) {
        
        String clave = "eureka";
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String  frase = leer.nextLine();
        if (frase.equals(clave)){
            System.out.println("La frase es correcta.");
        }else{
            System.out.println("La frase es incorrecta");
        }
    }
    
}
