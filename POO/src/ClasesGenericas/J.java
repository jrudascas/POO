package ClasesGenericas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

class Q<T> implements Iterable<T> {

    private ArrayList<T> l = new ArrayList<>();

    public Q(int t) {
        super();
    }

    public void f1(T o) {
        l.add(o);
    }
    
    public T f2(int i){
        return l.get(i);
    }

    @Override
    public Iterator<T> iterator() {
        return l.iterator();
    }
        
    public void s(Comparator<T> c){
        T[] tList = t();
        Arrays.sort(tList, c); l.clear();
        l.addAll(Arrays.asList(tList));        
    }
    
    public T[] t() {
        T[] list = (T[]) new Object[l.size()]; int cont = 0;
        for (T t : l) {
            list[cont] = t; cont++;
        }
        return list;
    }
}

class F<T> {

    private Integer i;
    private T j;
    public static int v = 3;

    F(T j, int i) {
        this.j = j;
        this.i = i;
        v--;
    }

    public T getJ() {
        return j;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}

class E extends F {

    private int k = 2;

    public E(Object j, int i) {
        super(j, i);
        this.k = (int) Math.pow(this.k, F.v);
    }
    
    public static Comparator<E> comparator = new Comparator<E>() {
        @Override
        public int compare(E t1, E t2) {                    
            return t1.getI().compareTo(t2.getI());
        }
    };

    public int getK() {
        return k;
    }
}

public class J {

    public static void main(String[] args) {

        Q<E> l = new Q<>(-8);
        l.f1(new E("Hola Mundo", 1));
        l.f1(new E(Math.PI, 9));
        l.f1(new E(new F("Hi", 2), 3));
        l.f1(new E("G", -1));
        
        l.s(E.comparator);        
                        
        int cont = 0;
        for (E e: l){
            System.out.println(((Math.pow(-1, cont) > 0)?e.getK():e.getJ()) + ": A");
            cont++;
        }
    }
}
