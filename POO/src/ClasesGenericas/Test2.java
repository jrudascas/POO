/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesGenericas;

import java.util.Date;

/**
 *
 * @author jrudascas d
 */
public class Test2 {

    public static void main(String[] args) {

        Lista2<Chocolate> bolsa = new Lista2<>(3);
        Chocolate c = new Chocolate("milka", "Nacional de Chocolate", new Date(System.currentTimeMillis()));
        Chocolate c1 = new Chocolate("milka", "Colombina", new Date(System.currentTimeMillis()));
        Chocolate c2 = new Chocolate("ferrero", "Colombina", new Date(System.currentTimeMillis()));

        bolsa.add(c);
        bolsa.add(c1);
        bolsa.add(c2);

        for (Chocolate chocolatina : bolsa) {

            System.out.println(chocolatina.getMarca());
        }

    }

}
