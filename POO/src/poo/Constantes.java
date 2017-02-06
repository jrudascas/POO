package poo;

public class Constantes {
    
    public static void main(String[] arg){
        f1();
        System.out.println(f2(1,3));
    }
    
    static void f1(){
        System.out.println("Un metodo");
    }
    
    static String f2(int num, int b){
        String mensaje = "Una funcion";
        return mensaje + num + b;
    }
}
