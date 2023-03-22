/*************************************************
 * Autor: America Yaridsaida Villalobos Rodriguez*
 * Fecha de creacion:21/03/2023                  *
 * Fecha de modificacion:22/03/2023              *
 * Descrpcion:programa que convierte una matriz  *
 * a transpuesta                                 *
 *************************************************/
package hola;

import java.util.Scanner;

public class Transpuesta {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        //se le pide al usuario que ingrese el numeros de filas de la matriz 
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = num.nextInt();
        //se le pide al usuaro que ingrese el numero de columnas para la matriz
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = num.nextInt();
     
        // declaramos el arreglo de la matriz 
        int[][] matriz = new int[filas][columnas];
        // ya una vez que el usuario declaro de cuantas filas y columnas es la matriz se le pide que ingrese los datos 
        System.out.println("Ingrese los elementos de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = num.nextInt();
            }
        }
        
        // se declara la matriz transpuesta para ingresar los datos de la matriz original pero a la hora de ingresarlos se ingresan por columnas 
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        
        // Imprimir la matriz transpuesta
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
