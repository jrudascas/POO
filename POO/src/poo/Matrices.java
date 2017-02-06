/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author jrudascas
 */
public class Matrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número de filas de la matrix: ");
        int filas = scanner.nextInt();
        System.out.println();
        System.out.print("Digite un número de columnas de la matrix: ");
        int columnas = scanner.nextInt();

        int[][] matrix = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("Digite el valor del elemento (" + i + "," + j + ") = ");
                matrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
    }
    
    public static void imprimirMatrix(){
        
    }
    
    public static int funccion1(){
        
        return 0;
    }
    
    public static int fuunccion2(){
        
        return 0;
    }
    
    public static int fuunccion3(){
        
        return 0;
    }
}
