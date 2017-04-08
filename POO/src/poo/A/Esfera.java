/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.A;

/**
 *
 * @author jrudascas
 */
public class Esfera {
    int radio;

    public Esfera(int radio) {
        this.radio = radio;
    }
        
    public double getVolume(){
        return (4*Math.PI*Math.pow(radio, 3))/3;
    }
}
