package Juegos;

import java.util.Scanner;
import java.util.Random;


public class PPT implements Juego{

    private String nombreJugador;
    private int jugador;
    private int maquina;
    
    public PPT(){

    }

        Scanner azar = new Scanner(System.in);

    public PPT (int jugador, int maquina) {
        this.jugador = jugador;
        this.maquina = maquina;
    }

    public void iniciar(){
        azar.nextLine();
        System.out.println("Ingrese su nombre completo");
        nombreJugador = azar.nextLine();

        
    }

    public void jugar(){

        Random probabilidad = new Random();
        maquina = probabilidad.nextInt(3);
        maquina+=1;

        System.out.println("--------- Elige ---------");
        System.out.println("1.Piedra / 2.Papel / 3.Tijera");
        jugador = azar.nextInt();

    }

    public void finalizar(){

        System.out.println("Jugador: " + nombreJugador);
        System.out.println("Su elección: " + jugador);
        System.out.println("Elección de la Maquina: " + maquina);
        if (jugador==maquina){
            System.out.println("Empate");
        } else if (jugador==1 && maquina==2) {
            System.out.println("Perdiste");
        } else if (jugador==1 && maquina==3){
            System.out.println("Ganaste");
        } else if (jugador==2 && maquina==3) {
            System.out.println("Perdiste");
        } else if (jugador==2 && maquina==1){
            System.out.println("Ganaste");
        } else if (jugador==3 && maquina==1) {
            System.out.println("Perdiste");
        } else if (jugador==3 && maquina==2){
            System.out.println("Ganaste");
        } else{
            System.out.println("Elección no valida");
        }

        System.out.println("Gracias por jugar ^_^");

        azar.close();
    }

}
