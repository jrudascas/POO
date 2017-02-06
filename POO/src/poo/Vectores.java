package poo;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] listaNum = new int[10];
        int[] listaNueva;

        for (int i = 0; i < listaNum.length; i++) {
            System.out.println("Digite un número");
            listaNum[i] = scanner.nextInt();
        }

        listaNueva = ordenarBurbuja(listaNum);

        System.out.println("Vector Inicial");
        System.out.println();

        imprimirVector(listaNum);
        System.out.println("Vector Ordenado");
        imprimirVector(listaNueva);

    }

    public static int[] ordenarBurbuja(int[] vector) {
        int temp;
        int [] vecAux = vector.clone();
        
        for (int i = 1; i < vecAux.length; i++) {
            for (int j = 0; j < vecAux.length - 1; j++) {
                if (vecAux[j] > vecAux[j + 1]) {
                    temp = vecAux[j];
                    vecAux[j] = vecAux[j + 1];
                    vecAux[j + 1] = temp;
                }
            }
        }

        return vecAux;
    }

    public static void imprimirVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
