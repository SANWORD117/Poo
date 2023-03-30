package Figuras;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {

        String eleccion;

        Scanner elegir = new Scanner(System.in);

        System.out.print("Escribe la figura que deseas calcular el area: ");
        eleccion = elegir.next();

        if (eleccion == "Rectangulo"){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calcularArea();
        } else if (eleccion == "Cuadrado") {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.calcularArea();
        } else if (eleccion == "Triangulo") {
        Triangulo triangulo = new Triangulo();
        triangulo.calcularArea();    
        } else if (eleccion == "Circulo") {
        Circulo circulo = new Circulo();
        circulo.calcularArea();    
        } else {
        System.out.println("Dato invalido");
        }
        elegir.close();
    }
}
