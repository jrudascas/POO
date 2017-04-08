/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesGenericas;

import java.util.Date;

/**
 *
 * @author jrudascas
 */
public class Test {

    public static void main(String[] args) {

        Lista bolsa = new Lista(3);
        Galleta c = new Galleta("milka", "Colombina");
        Chocolate c1 = new Chocolate("ChoKort", "Nacional de Chocolates", new Date(System.currentTimeMillis()));
        Chocolate c2 = new Chocolate("ferrero", "Italian Cholate", new Date(System.currentTimeMillis()));

        bolsa.add(c);
        bolsa.add(c1);
        bolsa.add(c2);

        for (Object o : bolsa) {

            if (o instanceof Chocolate) {

                Chocolate chocolatina = (Chocolate) o;
                System.out.println(chocolatina.getFechaVencimiento());

            } else {

                Galleta golosina = (Galleta) o;
                System.out.println(golosina.getNombre());
            }
        }

    }
}
