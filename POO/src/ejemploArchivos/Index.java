/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author jrudasc
 */
public class Index {

    public static FileWriter fichero = null;
    public static PrintWriter pw = null;
    public static FileReader fr = null;
    public static BufferedReader br = null;
    public static String ruta = "C:\\Users\\jrudasc\\Desktop\\Nuevo documento de texto.txt";
    
    public static BufferedReader abrirArchivoLectura() {
        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            return br;
        } catch (Exception e) {
        }
        return null;
    }

    public static PrintWriter abrirArchivoEscritura() {
        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            return pw;
        } catch (Exception e) {
        }
        return null;
    }

    public static void cerrarArchivo() {
        try {
            if (null != fichero) {
                fichero.close();
            }
            if (null != fr) {
                fr.close();
            }

            if (null != br) {
                br.close();
            }
            if (null != pw) {
                pw.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void main(String[] arg) {

        ManejadorEmpleado manejadorEmpleado = new ManejadorEmpleado();

        Empleado empleado1 = new Empleado("Jorge", "Rudas", 46468465, 546465);
        
        Empleado empleado2 = new Empleado("Daniela", "Castillo", 12345, 546465);
        
        //manejadorEmpleado.guardar(empleado2);
        
        manejadorEmpleado.eliminar(empleado1);
        
        
    }
}
