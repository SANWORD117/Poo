package Principal;

import Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        
        Empleado Sebastian = new Empleado();

        Sebastian.pedirDatos();

        Sebastian.mostrarPersona();

        Sebastian.calcularImc();

        Sebastian.calcularHonorarios();

        Sebastian.mostrarEmpleado();

    }
}
