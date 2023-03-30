package Salud;

import java.util.Scanner;

public class Empleado extends Persona {
    Scanner leer = new Scanner(System.in);

    private String cargo;
    private int valorhora;
    private int horastrabajadas;
    private int departamento;
    private double valorhonorarios;

    public Empleado(){
    }
    
    public Empleado(String Tipo_Doc, String nombre, String apellido,
            int Documento, String cargo, int valorhora, int horastrabajadas,
            int departamento) {

        super(Tipo_Doc, cargo, nombre, apellido, departamento, Documento, valorhora, horastrabajadas, departamento);
        this.cargo = cargo;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public double getValorhonorarios() {
        return valorhonorarios;
    }

    public void setValorhonorarios(double valorhonorarios) {
        this.valorhonorarios = valorhonorarios;
    }

    public void calcularHonorarios(){
        
        double RETEICA = 0.966;

        System.out.print("ingrese el cargo del Empleado: ");
        cargo = leer.next();
        System.out.print("ingrese el valor de la hora del Empleado: ");
        valorhora = leer.nextInt();
        System.out.print("ingrese el horas trabajadas del Empleado: ");
        horastrabajadas = leer.nextInt();
        System.out.print("ingrese el departamento del Empleado: ");
        departamento = leer.nextInt();

        valorhonorarios=(valorhora*horastrabajadas)-RETEICA;

        
        System.out.println("Total a pagar: " + valorhonorarios);
        
        
    }

    public void mostrarEmpleado(){

        System.out.println("Tipo de Documento: " +getTipo_Doc());
        System.out.println("Numero de Documento: " + getDocumento());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Cargo: " + cargo);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas trabajadas: " + horastrabajadas);
        System.out.println("Valor por hora: " + valorhora);

    }
}
