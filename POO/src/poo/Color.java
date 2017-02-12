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
public class Color {
    private int rojo;
    private int verde;
    private int azul;

    public Color(int rojo, int verde, int azul) {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    public int getRojo() {
        return rojo;
    }

    public int getVerde() {
        return verde;
    }

    public int getAzul() {
        return azul;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public void setVerde(int verde) {
        this.verde = verde;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }
}
