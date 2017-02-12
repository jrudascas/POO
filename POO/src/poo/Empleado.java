/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author jrudascas
 */
public class Empleado {

    String nombres;
    String apellidos;
    int cedula;
    int saldoCuentaAhorros;
    
    public Empleado() {
        
    }
    
    public void retirarDineroCA(int monto){
        saldoCuentaAhorros = saldoCuentaAhorros - monto;        
    }
}