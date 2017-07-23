package ClasesGenericas;

import java.util.Date;

public class Test2 {

    public static void main(String[] args) {
        
        Q<Chocolate> bolsa = new Q<>(3);
        Chocolate c = new Chocolate("milka", "Nacional de Chocolate", new Date(System.currentTimeMillis()));
        Chocolate c1 = new Chocolate("milka", "Colombina", new Date(System.currentTimeMillis()));
        Chocolate c2 = new Chocolate("ferrero", "Colombina", new Date(System.currentTimeMillis()));

        bolsa.f1(c);
        bolsa.f1(c1);
        bolsa.f1(c2);

        for (Chocolate chocolatina : bolsa) {

            System.out.println(chocolatina.getMarca());
        }

    }

}
