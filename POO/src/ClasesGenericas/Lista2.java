/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesGenericas;

/**
 *
 * @author jrudascas
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Lista2<T> implements Iterable<T> {

    private ArrayList<T> lista = new ArrayList<T>();
    private int tope;

    public Lista2(int tope) {
        super();
        this.tope = tope;
    }

    public void add(T objeto) {
        if (lista.size() <= tope) {

            lista.add(objeto);
        } else {

            System.out.println("Lista llena"); 
        }

    }

    public Iterator<T> iterator() {
        return lista.iterator();
    }    
}
