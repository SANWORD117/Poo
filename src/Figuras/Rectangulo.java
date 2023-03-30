package Figuras;

import java.util.Scanner;


public class Rectangulo extends Figura {

    private int baseR;
    private int alturaR;

    public Rectangulo(){
        
    }

public Rectangulo (int baseR, int alturaR) {
    this.baseR = baseR;
    this.alturaR = alturaR;
}

    public void calcularArea(){
        float areaR;
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base del rectangulo: ");
        baseR = leer.nextInt();

        System.out.print("Ingrese el valor de la base del rectangulo: ");
        alturaR = leer.nextInt();

        areaR =baseR*alturaR;

        System.out.println("La base del rectangulo es de: " + baseR + "cm");
        System.out.println("La altura del rectangulo es de: " + alturaR + "cm");
        System.out.println("El area del rectangulo es de: " + areaR + "cm");

        leer.close();

    }
}
