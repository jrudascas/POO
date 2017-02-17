/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testPaisaje;

import java.util.ArrayList;
import java.util.List;

public class Index {
    
    public static void main(String[] arg){
        
        List<Arbol> listArboles = new ArrayList<>();
        List<Ardilla> listArdillas = new ArrayList<>();
        List<Conejo> listConejos = new ArrayList<>();
        List<Pato> listPatos = new ArrayList<>();
        List<Pez> listPeces = new ArrayList<>();
        
        listArboles.add(new Arbol(3, "Rosal", new Fruto("Rojo", "Delicioso", 4)));
        listArboles.add(new Arbol(34, "Manzana", new Fruto("Rojo", "Delicioso", 2)));
        
        listArdillas.add(new Ardilla("Salvaje", 2));
        listArdillas.add(new Ardilla("Salvaje", 2));
        
        listConejos.add(new Conejo("Salvaje", 3, "Blanco"));
        listConejos.add(new Conejo("Salvaje", 3, "Negro"));
                
        listPatos.add(new Pato("Blanco", "Comun", 3));
        listPatos.add(new Pato("Blanco", "Comun", 3));
        
        listPeces.add(new Pez("Bagre", 3, "Rayado"));
        listPeces.add(new Pez("Salmon", 43, "Naranja"));
        
        Paisaje paisaje = new Paisaje(listArboles, listArdillas, new Camino(12, 32, "Arcilla"), listConejos, new Lago(listPatos, listPeces, "Azul", 100));
                               
        Maiz maiz = new Maiz("Gallina", "Amarillo", 2);
        
        paisaje.lago.listPatos.get(0).comer(maiz);
    }
}
