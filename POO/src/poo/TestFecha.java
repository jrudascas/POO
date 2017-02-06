
package poo;

import java.util.Scanner;

public class TestFecha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese Fecha1 (dia, mes y anio): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        
        Fecha f1 = new Fecha(dia, mes, anio);
        
        System.out.print("Ingrese Fecha2 (dia, mes y anio): ");
        
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        anio = scanner.nextInt();

        Fecha f2 = new Fecha(dia, mes, anio);
        
    }
}
