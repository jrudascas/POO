package poo;

import java.util.Scanner;

public class HolaMundoIn2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese nombre edad altura: ");
        //Leemos por consola
        String nom = scanner.next();
        int edad = scanner.nextInt();
        
        double altura = scanner.nextDouble();
        /*Imprimimos las variables capturadas por consola*/
        System.out.println("Nombre: " + nom
                + " Edad: " + edad
                + " Altura : " + altura);
    }
}
