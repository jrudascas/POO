/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testPaisaje;

import java.util.List;

/**
 *
 * @author jrudascas
 */
public class Lago {
    List<Pato> listPatos;
    List<Pez> listPez;
    String colorAgua;
    int cantidadAgua;

    public Lago(List<Pato> listPatos, List<Pez> listPez, String colorAgua, int cantidadAgua) {
        this.listPatos = listPatos;
        this.colorAgua = colorAgua;
        this.cantidadAgua = cantidadAgua;
        this.listPez = listPez;
    }
}
