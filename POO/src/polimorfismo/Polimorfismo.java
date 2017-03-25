package polimorfismo;

import java.util.ArrayList;

public class Polimorfismo {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Figura esfera1 = new Esfera(2, "esfera1", 5, 5);
        Figura esfera2 = new Esfera(3, "esfera2", 6, 4);
        Figura esfera3 = new Esfera(4, "esfera3", 57, 3);
        Figura cubo1 = new Cubo(2, "Cubo1", 1, 5);
        Figura cubo2 = new Cubo(3, "Cubo2", 2, 1);
        Figura cubo3 = new Cubo(4, "Cubo3", 3, 2);
        Figura piramide1 = new Piramide(2, 2, "Piramide1", 1, 5);
        Figura piramide2 = new Piramide(3, 4, "Piramide2", 2, 1);
        Figura piramide3 = new Piramide(4, 5, "Piramide3", 3, 2);
        Figura cuadrado1 = new Cuadrado(2, "Cuadrado1", 1, 5);
        Figura cuadrado2 = new Cuadrado(3, "Cuadrado2", 2, 1);
        Figura cuadrado3 = new Cuadrado(4, "Cuadrado3", 3, 2);
        Figura circulo1 = new Circulo(2, "Circulo1", 1, 5);
        Figura circulo2 = new Circulo(3, "Circulo2", 2, 1);
        Figura circulo3 = new Circulo(4, "Circulo3", 3, 2);
        Figura triangulo1 = new Triangulo(2, 2, "Triangulo1", 1, 5);
        Figura triangulo2 = new Triangulo(3, 4, "Triangulo2", 2, 1);
        Figura triangulo3 = new Triangulo(4, 5, "Triangulo2", 3, 2);

        figuras.add(esfera1);
        figuras.add(esfera2);
        figuras.add(esfera3);
        figuras.add(cubo1);
        figuras.add(cubo2);
        figuras.add(cubo3);
        figuras.add(piramide1);
        figuras.add(piramide2);
        figuras.add(piramide3);
        figuras.add(cuadrado1);
        figuras.add(cuadrado2);
        figuras.add(cuadrado3);
        figuras.add(circulo1);
        figuras.add(circulo2);
        figuras.add(circulo3);
        figuras.add(triangulo1);
        figuras.add(triangulo2);
        figuras.add(triangulo3);

        Figura3D aux3D = null;
        Figura3D aux3D2 = null;

        Figura2D aux2D = null;
        Figura2D aux2D2 = null;

        double maxVol = -1;
        double maxPer = -1;
        
        for (Figura integrante : figuras) {
            System.out.println(integrante);
            if (integrante instanceof Figura3D) {
                aux3D = (Figura3D) integrante;
                if (aux3D.CalcularVolumen() > maxVol) {
                    maxVol = aux3D.CalcularVolumen();
                    aux3D2 = aux3D;
                }
            }

            if (integrante instanceof Figura2D) {
                aux2D = (Figura2D) integrante;
                if (aux2D.CalcularPerimetro() > maxPer) {
                    maxPer = aux2D.CalcularPerimetro();
                    aux2D2 = aux2D;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("La figura3D " + aux3D2 + " es la de mayor volumen con " + aux3D2.CalcularVolumen());
        System.out.println("La figura2D " + aux2D2 + " es la de mayor perimetro con " + aux2D2.CalcularPerimetro());
    }
}
