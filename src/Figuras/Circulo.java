package Figuras;

import java.util.Scanner;


public class Circulo extends Figura {

    private double radio;

    public Circulo(){
        
    }

public Circulo (double radio) {
    this.radio = radio;
}

    public void calcularArea(){
        double areaCc;
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base del circulo: ");
        radio = leer.nextDouble();

        double pi = 3.14;

        areaCc = pi*(radio*radio);

        System.out.println("El radio del circulo es de: " + radio + "cm");
        System.out.println("El area del circulo es de: " + areaCc + "cm");
        

        leer.close();

    }
}