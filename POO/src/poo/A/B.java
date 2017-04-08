package poo.A;

import java.util.ArrayList;
import java.util.List;

class A {
    int that;
    public A(int that) {
        this.that = that;
    }
    public double f1() {
        return (Math.pow(that, 3) * 
                Math.pow(Math.PI, 2)) / (Math.PI * that);
    }
}

public class B {
    public static void main(String[] arg) {
        List<A> l = new ArrayList();
        int n = 3;
        double data1 = -1.141;
        double data2 = 73823.45;        
        for (int i = 1; i <= n; i++) {
            l.add(new A(i));
        }        
        for (A e : l) {
            data1 = e.f1() > data1?e.f1():data1;
            data2 = e.f1() < data2?e.f1():data2;            
        }
        System.out.println(data1);
        System.out.println(data2);
    }
}
