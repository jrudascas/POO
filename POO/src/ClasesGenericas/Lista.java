package ClasesGenericas;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista implements Iterable {

    private ArrayList lista = new ArrayList();
    private int tope;

    public Lista(int tope) {
        super();
        this.tope = tope;
    }

    public void add(Object objeto) {
        if (lista.size() <= tope) {

            lista.add(objeto);
        } else {
            System.out.println("Lista llena");            
        }

    }

    @Override
    public Iterator iterator() {
        return lista.iterator();
    }

}
