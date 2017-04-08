package polimorfismo;

public class Cuadrado extends Figura2D {

    private int lado;

    public Cuadrado(int lado, String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
        this.lado = lado;
    }

    @Override
    public double CalcularPerimetro() {        
        return lado * 4;        
    }

    @Override
    public double CalcularArea() {        
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
