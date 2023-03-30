package Figuras;

import java.util.Scanner;

public class Cuadrado extends Figura {

private int ladoC;

public Cuadrado(){
        
}

public Cuadrado (int ladoC){
    this.ladoC = ladoC;
}

    public void calcularArea(){
        float areaC;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del cuadrado: ");
        ladoC = leer.nextInt();

        areaC =ladoC*ladoC;
        System.out.println("Los lados del cuadrado son de: " + ladoC + "cm");
        System.out.println("El area del cuadrado es de: " + areaC + "cm");

        
        leer.close();
}
}
