package poo.esfera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jrudascas
 */
public class Index {
    
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantas esferas desea crear");
        int numEsferas = scanner.nextInt();
        List<Esfera> listEsferas = new ArrayList();
        
        for (int i = 0; i < numEsferas; i++){
            System.out.println("Digite el radio de la esfera numero " + i + 1);
            listEsferas.add(new Esfera(scanner.nextInt()));
        }
                
        double max = -1;
        double min = 999999999;
        for (Esfera e: listEsferas){
            if (e.getVolume() > max)
                max = e.getVolume();
            if (e.getVolume() < min)
                min = e.getVolume();
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }    
}
