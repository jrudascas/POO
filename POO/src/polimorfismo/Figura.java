package polimorfismo;

public abstract class Figura {

    private String nombre;
    private int GrosorBirde;
    private int Color;

    public String getNombre() {
        return nombre;
    }

    public Figura(String nombre, int GrosorBirde, int Color) {
        this.nombre = nombre;
        this.GrosorBirde = GrosorBirde;
        this.Color = Color;
    }

    public abstract void dibujar();

    public int getGrosorBirde() {
        return GrosorBirde;
    }

    public int getColor() {
        return Color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrosorBirde(int GrosorBirde) {
        this.GrosorBirde = GrosorBirde;
    }

    public void setColor(int Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
