
package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Imgrese la cantidad de estudiantes");
        int numEstudiantes = teclado.nextInt();
        int acumulador = 0 ;
        double[] promedio = new double[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            promedio[i] = Math.random() * 11;
            acumulador += promedio[i];
        } 
        double promedioCiclo = acumulador / numEstudiantes;
        double mejorPromedio = 0;
        double peorPromedio = 10;
        double mejorEstudiante =0;
        double peorEstudiante = 0;
        System.out.println("Estudiantes con nota por encima del promedio");
        for (int i = 0; i < numEstudiantes; i++) {
            if(promedio[i] > promedioCiclo){
                System.out.println(" Estudiante " + i + " Promedio " + promedio[i]);
            } 
            if(promedio[i] > mejorPromedio){
                mejorPromedio = promedio[i];
                mejorEstudiante = i ;                
            }
            if(promedio[i] < peorPromedio){
                peorPromedio = promedio[i];
                peorEstudiante = i;
            }
        }
        System.out.println("Estudiantes con nota por debajo del promedio");
        for (int i = 0; i < numEstudiantes; i++) {
            if(promedio[i] < promedioCiclo){
                System.out.println("Estudiante " + i + "Promedio " + promedio[i]);
            }
        }
        System.out.println("Promedio del ciclo" + promedioCiclo);
        System.out.println("Estudiante con la mejor calificacion " + mejorEstudiante + "Promedio "+ mejorPromedio);
        System.out.println("Estudiante con la mejor calificacion " + peorEstudiante + "Promedio "+peorPromedio);

        
    }
}
