package polimorfismo;

public abstract class Figura2D extends Figura {

    public Figura2D(String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
    }
    
    @Override
    public void dibujar(){
        System.out.print("Dibujar Figura2D");
    }
    
    public abstract double CalcularArea();
    
    public abstract double CalcularPerimetro();
}
