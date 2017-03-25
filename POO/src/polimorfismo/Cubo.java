package polimorfismo;

public class Cubo extends Figura3D {

    private int lado;

    public Cubo(int lado, String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
        this.lado = lado;
    }

    @Override
    public double CalcularVolumen() {
        return lado * lado * lado;
    }
}
