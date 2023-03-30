package Salud;

public class Ejecucion {
    public static void main(String[] args) {
        Persona Uribe = new Persona();

        Uribe.pedirDatos();
        
        Uribe.mostrarPersona();

        Uribe.calcularImc();

        Uribe.mayorEdad();

    }
}
