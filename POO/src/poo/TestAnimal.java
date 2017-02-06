/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author jrudascas
 */
public class TestAnimal {

    public static void main(String[] arg) {
        AnimalAbstract mamifero = new Mamifero();
        AnimalAbstract ave = new Ave();

        mamifero.reproducir();
        ave.reproducir();
        
        mamifero.comer();
        ave.comer();
    }
}
