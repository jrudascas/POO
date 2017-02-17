/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testPaisaje;

/**
 *
 * @author jrudascas
 */
public class Arbol {
    int tamaño;
    String especie;
    Fruto fruto;

    public Arbol(int tamaño, String especie, Fruto fruto) {
        this.tamaño = tamaño;
        this.especie = especie;
        this.fruto = fruto;
    }
    
    void crecer(){
        
    }   
    
    Fruto generarFruto(){
        return new Fruto("Rojo", "Delicioso", 3);
    }
}
