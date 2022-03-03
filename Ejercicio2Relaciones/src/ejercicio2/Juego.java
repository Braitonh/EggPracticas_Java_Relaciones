package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    private Scanner leer;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.revolver = new Revolver();
        this.leer = new Scanner(System.in);
    }

    

    public void crearJugador() {
        

        System.out.println("Ingrese el nombre del jugador");
        String nombre = leer.next();

        System.out.println("ingrese el ID del jugador");
        int id = leer.nextInt();

        Jugador jugador = new Jugador();
        jugador.setId(id);
        jugador.setNombre(nombre);

        agregarjugador(jugador);

    }
    
    public void agregarjugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void cantidadJugadores() {
        System.out.println("Ingrese la cantidad de jugadores que desea");
        int cantidadJugadores = leer.nextInt();

//        if (cantidadJugadores < 1 || cantidadJugadores > 6) {
//            cantidadJugadores = 6;
//        }

        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Jugador N°: " + (i+1));
            crearJugador();
        }
    }
    
    public void jugadoresDeLaPartida(){
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
    }
    
    

    public void ronda() {

        boolean bandera;
        do {
            int i = 0;

            bandera = jugadores.get(i).disparo(revolver);

            i++;

        } while (!bandera);

        System.out.println("EL jugador mojado es:");
        for (Jugador jugadore : jugadores) {
            if (jugadore.isMojado()) {
                System.out.println(jugadore);
            }
        }

    }

}

//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
//Jugadores) y Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
