package polimorfismo;

public class Triangulo extends Figura2D {

    private int base;
    private int altura;

    public Triangulo(int base, int altura, String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularPerimetro() {
        return base * 3;
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }
}
