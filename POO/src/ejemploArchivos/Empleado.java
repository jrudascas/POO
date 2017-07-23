package ejemploArchivos;

public class Empleado {

    String nombres;
    String apellidos;
    int cedula;
    int saldoCuentaAhorros;

    public Empleado(String nombres, String apellidos, int cedula, int saldoCuentaAhorros) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.saldoCuentaAhorros = saldoCuentaAhorros;
    }

    public void retirarDineroCA(int monto) {
        saldoCuentaAhorros = saldoCuentaAhorros - monto;
    }

    public String toString() {
        return nombres + " " + apellidos;
        //return String.format("%030d;%30s;%30s;%030d", cedula, nombres, apellidos, saldoCuentaAhorros);
    }
}