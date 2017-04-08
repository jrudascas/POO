package javadocs;

import java.util.Comparator;

/**
 * Esta clase define la estructura de una coleccion 1D
 *
 * @author: Jorge Rudas
 * @version: 07/04/2017
 * @see <a href = "https://sites.google.com/view/jorgerudas/poo2017i" /> Curso
 * de Programacion Orientada a Objetos - Universidad Central</a>
 */
public class Coleccion1D {

    private int size;    
    private Object[] list;
    /**
     * Constructor para la serie de números aleatorios
     * @param size El parámetro size define el tamaño de la colección
     */
    public Coleccion1D(int size) {
        this.size = size;        
        list = new Object[size];
    }
    
    
    /**
     * Metodo que ordena los elementos de la coleccion segun criterio indicado
     * @param c El parámetro c define la logica de comparacion para el ordenamiento
     */
    public void sort(Comparator c){
        
    }

    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
}
