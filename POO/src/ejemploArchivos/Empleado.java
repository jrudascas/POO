/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploArchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrudascas
 */
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
        return String.format("%030d;%30s;%30s;%030d", cedula, nombres, apellidos, saldoCuentaAhorros);
    }
}