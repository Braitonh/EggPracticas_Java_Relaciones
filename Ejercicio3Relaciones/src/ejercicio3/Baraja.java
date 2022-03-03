package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasRetirada;

    public Baraja() {
        this.cartas = new ArrayList<>();
        this.cartasRetirada = new ArrayList<>();
    }

    public void crearCarta(String palo) {

        int i = 1;

        do {

            if (i == 8) {
                i = 10;
            }
            Carta carta = new Carta();
            carta.setPalo(palo);
            carta.setNumero(i);
            cartas.add(carta);
            i++;

        } while (i < 13);

    }

    public void crearMazo() {
        cartas.clear();
        crearCarta("espada");
        crearCarta("oro");
        crearCarta("basto");
        crearCarta("copa");
    }

    public void mostrarMazo() {

        if (cartas.size() == 0) {
            System.out.println("NO hay mas cartas en el mazo");
        } else {
            System.out.println("Las cartas del mazo son:");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }

    }

    public void mostarMazoRetirado() {
        if (cartas.size() > 40) {
            System.out.println("No se retiro ninguna carta del mazo");
        } else {
            System.out.println("Las cartas retiradas son:");
            for (Carta carta : cartasRetirada) {
                System.out.println(carta);
            }
        }
    }

    public void barajarCartas() {

        Collections.shuffle(cartas);
    }

    public void siguienteCarta() {

        Iterator<Carta> iterator = cartas.iterator();

        if (cartas.size() == 0) {
            System.out.println("No hay mas cartas en el mazo");
        } else {
            cartasRetirada.add(iterator.next());
            iterator.remove();
        }

    }

    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es: " + cartas.size());
    }

    public void darCartas() {

        Scanner leer = new Scanner(System.in);
        Iterator<Carta> iterator = cartas.iterator();

        System.out.println("Cuantas cartas necesitas");
        int cantidad = leer.nextInt();

        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas en el mazo");
        } else {
            for (int i = 0; i < cantidad; i++) {
                cartasRetirada.add(iterator.next());

                iterator.remove();
            }

        }

    }

}
