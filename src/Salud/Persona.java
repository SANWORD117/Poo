package Salud;

import java.util.Scanner;

public class Persona {

    private String Tipo_Doc;
    private String sexo;
    private String nombre;
    private String apellido;
    private int edad;
    private int Documento;
    private double peso;
    private double estatura;
    private double pesoActual;
    
    public Persona(){
        
    }
    
    public Persona(String tipo_Doc, String sexo, String nombre, String apellido, int edad, int documento, double peso,
            double estatura, double pesoActual) {
        Tipo_Doc = tipo_Doc;
        this.sexo = sexo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        Documento = documento;
        this.peso = peso;
        this.estatura = estatura;
        this.pesoActual = pesoActual;
    }

    

    public String getTipo_Doc() {
        return Tipo_Doc;
    }



    public void setTipo_Doc(String tipo_Doc) {
        Tipo_Doc = tipo_Doc;
    }



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public int getDocumento() {
        return Documento;
    }



    public void setDocumento(int documento) {
        Documento = documento;
    }



    public double getPeso() {
        return peso;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }



    public double getEstatura() {
        return estatura;
    }



    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }



    public double getPesoActual() {
        return pesoActual;
    }



    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }



    public void pedirDatos() {

        Scanner captura = new Scanner(System.in);
    
        System.out.print("Ingrese el Tipo de Documento: ");
        Tipo_Doc = captura.next();
        System.out.print("Ingrese el Numero de Documento: ");
        Documento = captura.nextInt();

        captura.nextLine();

        System.out.print("Ingrese su Nombre: ");
        nombre = captura.nextLine();
        System.out.print("Ingrese su Apellido: ");
        apellido = captura.nextLine();
        System.out.print("Ingrese su Peso: ");
        peso = captura.nextDouble();
        System.out.print("Ingrese su Estatura: ");
        estatura = captura.nextDouble();
        System.out.print("Ingrese su Edad: ");
        edad = captura.nextInt();
        System.out.print("Ingrese su Sexo: ");
        sexo = captura.next();

        captura.close();
    }
    
    public void mostrarPersona() {
        System.out.println("--------------------");
        System.out.println("Tipo de Documento: " + Tipo_Doc);
        System.out.println("Documento: " + Documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("--------------------");
    }
    
    public void calcularImc() {
        pesoActual=peso/(estatura*2);
        System.out.println("Tu peso actual es de: " +pesoActual);

        if (pesoActual<20){
            System.out.println("El peso esta debajo de lo ideal");
        } else if (pesoActual>20 && pesoActual<25){
            System.out.println("El peso es ideal");
        } else if (pesoActual>25){
            System.out.println("Tiene Sobrepeso");
        } else {
            System.out.println("Se digito el peso incorrectamente");
        }
    }

    public void mayorEdad(){
        if (edad<18) {
            System.out.println("Eres menor de edad");
        } else if (edad>18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Se digito la edad incorrectamente");
        }
        System.out.println("--------------------");
    }
    
}
