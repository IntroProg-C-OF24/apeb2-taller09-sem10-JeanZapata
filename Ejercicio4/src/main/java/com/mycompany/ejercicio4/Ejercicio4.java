
package com.mycompany.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (String estudiante : estudiantes) {
                if (estudiante.startsWith(inicial)) {
                    bandera = false;
                    break;  
                }
            }
        }
        System.out.println("Se ingresó una letra que coincide con la cadena de nombres.");
    }
}
    
