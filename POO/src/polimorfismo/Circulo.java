package polimorfismo;

public class Circulo extends Figura2D {

    private int radio;

    public Circulo(int radio, String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
        this.radio = radio;
    }

    @Override
    public double CalcularPerimetro() {        
        return (radio * 2) * Math.PI;        
    }

    @Override
    public double CalcularArea() {        
        return (radio * radio) * Math.PI;        
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
