package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    private Scanner leer;
    private ArrayList<Perro> perros;
    private ArrayList<Persona> personas;

    public Servicio() {
        this.perros = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public void crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.next();

        System.out.println("ingrese apellido de la persona:");
        String apellido = leer.next();
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
        System.out.println("Ingrese el documento:");
        int documento = leer.nextInt();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDocumento(documento);
        persona.setEdad(edad);

        System.out.println("Ingrese una raza que te gusta");
        String razaPreferencia = leer.next();

        Perro perroDeseado = new Perro(null, razaPreferencia, 0, null);

        persona.setPerro(perroDeseado);

        personas.add(persona);

    }

    public void crearPerro() {

        Perro perro = new Perro();

        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();

        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();

        System.out.println("Ingrese la edad del perro");
        int edad = leer.nextInt();

        System.out.println("Ingrese el tamaño del perro");
        String tamano = leer.next();
        perro.setNombre(nombre);
        perro.setRaza(raza);
        perro.setEdad(edad);
        perro.setTamano(tamano);

        perros.add(perro);

    }

    public void procesoDeCreacion() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Crear Persona");
            crearPersona();
            System.out.println("Crear Perro");
            crearPerro();
        }

        System.out.println("La lista de personas es:");
        for (Persona i : personas) {
            System.out.println(i);
        }

        System.out.println("La lista de perros Disponibles es:");
        for (Perro perro : perros) {
            System.out.println(perro);
        }

    }

    public void procesoAsignacion() {
        int i = 0;
        for (Perro perro : perros) {

            if (perro.getRaza().equalsIgnoreCase(personas.get(i).getPerro().getRaza())) {

                personas.get(i).setPerro(perro);
            }
            i++;
        }

        System.out.println("Lista de personas que adotaron un perro");
        for (Persona persona : personas) {

            System.out.println(persona);

        }

    }

}
//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//Persona con atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde la clase Persona, la información del Perro y de la Persona.
