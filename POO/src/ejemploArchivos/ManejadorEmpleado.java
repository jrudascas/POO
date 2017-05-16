/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploArchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrudasc
 */
public class ManejadorEmpleado {

    public List<Empleado> listarEmpleados() {
        List<Empleado> listaEmpleados = new ArrayList();
        
        try {
            BufferedReader br = Index.abrirArchivoLectura();            
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                listaEmpleados.add(new Empleado(campos[1].trim(), campos[2].trim(), Integer.valueOf(campos[0]), Integer.valueOf(campos[3])));
            }
            
            Index.cerrarArchivo();
            return listaEmpleados;
        } catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean guardar(Empleado e) {
        try {
            BufferedReader br = Index.abrirArchivoLectura();
            String contenido = "";
            String linea;

            while ((linea = br.readLine()) != null) {
                if (!contenido.isEmpty()) {
                    contenido = contenido + "\r\n" + linea;
                } else {
                    contenido = linea;
                }
            }

            Index.cerrarArchivo();

            PrintWriter pw = Index.abrirArchivoEscritura();
            if (!contenido.isEmpty()) {
                pw.println(contenido);
            }

            pw.println(e.toString());

            Index.cerrarArchivo();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminar(Empleado e) {
        try {
            BufferedReader br = Index.abrirArchivoLectura();
            String contenido = "";
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] campos = linea.split(";");
                if (!(Integer.parseInt(campos[0]) == e.cedula)) {
                    if (!contenido.isEmpty()) {
                        contenido = contenido + "\r\n" + linea;
                    } else {
                        contenido = linea;
                    }
                }
            }

            Index.cerrarArchivo();

            PrintWriter pw = Index.abrirArchivoEscritura();
            pw.println(contenido);

            Index.cerrarArchivo();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
