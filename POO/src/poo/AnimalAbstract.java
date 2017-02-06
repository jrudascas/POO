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
public abstract class AnimalAbstract {

    public void caminar() {
        System.out.println("Caminando ANIMAL");
    }

    public void comer() {
        System.out.println("Comiendo ANIMAL");
    }

    public abstract void reproducir();
}
