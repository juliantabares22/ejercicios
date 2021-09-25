/*
        Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres
        calificaciones
 */
package com.mycompany.ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        System.out.println("Digite tres calificaciones: ");
        
        //guardamos las tres calificaciones
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3; //se suman las tres notas
        
        System.out.println("\nLa suma es: " + suma);
        
        
        
        
        
        
        
        

    }

}
