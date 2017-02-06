package poo;

public class ExamplePolimorfismo {

    public static void main(String[] args) {
        Fecha fec = new FechaDetalladaHerencia("25/2/1980");        
        Object obj = new FechaDetalladaHerencia("3/12/2008");
                
        System.out.println("fec = " + fec.toString()); // invoca a toString de fec
        System.out.println("obj = " + obj.toString()); // invoca a toString de obj
    }
}
