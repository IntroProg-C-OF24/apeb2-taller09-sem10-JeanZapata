
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         System.out.print("Ingrese el número de marcas a ingresar: ");
        int numElementos = teclado.nextInt();
        teclado.nextLine(); 
        String[] marcas = new String[numElementos];
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingrese la marca " + (i + 1) + ": ");
            String marca = teclado.nextLine();

            if (!marca.startsWith("A") && !marca.startsWith("C") && !marca.startsWith("T")) {
                marcas[i] = marca;
            } else {
                System.out.println("Marca no contabilizada.");
                i--;
            }
        }
        System.out.println("Marcas ingresadas:");
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] != null) {
                System.out.println(marcas[i]);
            }
        }
    }
}
