package polimorfismo;

public abstract class Figura3D extends Figura {

    public Figura3D(String nombre, int GrosorBirde, int Color) {
        super(nombre, GrosorBirde, Color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujar Figura3D");
    }

    public abstract double CalcularVolumen();
}
