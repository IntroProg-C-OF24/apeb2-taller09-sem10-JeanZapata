
package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        double media = suma / arreglo.length;
        int arribaMedia = 0;
        int abajoMedia = 0;

        for (int num : arreglo) {
            if (num > media) {
                arribaMedia++;
            } else if (num < media) {
                abajoMedia++;
            }
        }
        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos arriba de la media: " + arribaMedia);
        System.out.println("Elementos por debajo de la media: " + abajoMedia);
    }
}

