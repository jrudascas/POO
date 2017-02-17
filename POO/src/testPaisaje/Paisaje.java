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
public class Paisaje {
    List<Arbol> listArboles;
    List<Ardilla> listArdillas;
    Camino camino;
    List<Conejo> listConejos;
    Lago lago;

    public Paisaje(List<Arbol> listArboles, List<Ardilla> listArdillas, Camino camino, List<Conejo> listConejos, Lago lago) {
        this.listArboles = listArboles;
        this.listArdillas = listArdillas;
        this.camino = camino;
        this.listConejos = listConejos;
        this.lago = lago;
    }
}
