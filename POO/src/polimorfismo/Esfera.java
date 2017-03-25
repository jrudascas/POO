package polimorfismo;

public class Esfera extends Figura3D {

    private int radio;

    public Esfera(int radio, String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
        this.radio = radio;
    }

    @Override
    public double CalcularVolumen() {
        return Math.pow(radio,3) * Math.PI;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
