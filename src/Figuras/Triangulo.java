package Figuras;

import java.util.Scanner;


public class Triangulo extends Figura {

    private int baseT;
    private int alturaT;

    public Triangulo(){
        
    }

public Triangulo (int baseT, int alturaT) {
    this.baseT = baseT;
    this.alturaT = alturaT;
}

    public void calcularArea(){
        float areaT;
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base del triangulo: ");
        baseT = leer.nextInt();

        System.out.print("Ingrese el valor de la altura del triangulo: ");
        alturaT = leer.nextInt();

        areaT =(baseT*alturaT)/2;

        System.out.println("La base del triangulo es de: " + baseT + "cm");
        System.out.println("La altura del triangulo es de: " + alturaT + "cm");
        System.out.println("El area del triangulo es de: " + areaT + "cm");
        

        leer.close();

    }
}
