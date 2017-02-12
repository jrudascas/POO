package poo;

public class FechaDetalladaHerencia extends Fecha {

    private static final String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public FechaDetalladaHerencia(int dia, int mes, int anio) {
        // invocamos al constructor del padre
        super(dia, mes, anio);
    }

    public FechaDetalladaHerencia(String s) {
        // invocamos al constructor del padre
        super(s);
    }

    public FechaDetalladaHerencia() {
        // invocamos al constructor del padre
        super();
    }

    @Override
    public String toString() {
        return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
    }
}
