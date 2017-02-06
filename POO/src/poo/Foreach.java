/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

import java.util.ArrayList;

/**
 *
 * @author jrudascas
 */
public class Foreach {
    
    public static void main (String[] fgf){
        ArrayList<String> lista = new ArrayList();
        
        lista.add("Jorge");
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Julian");
        lista.add("Carmen");
        
        /*for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }*/
        
        for (String valor: lista){
            System.out.println(valor);
        }

    }
    
}
