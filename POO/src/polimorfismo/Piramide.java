package polimorfismo;

public class Piramide extends Figura3D {

    private int base;
    private int altura;

    public Piramide(int base, int altura, String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularVolumen() {
        return (base * altura) / 3;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
