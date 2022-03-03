
package ejercicio2;


public class Servicios {
    
    private Juego servicio;

    public Servicios() {
        this.servicio = new Juego();
    }

    
    
    public Juego getServicio() {
        return servicio;
    }

    public void setServicio(Juego servicio) {
        this.servicio = servicio;
    }
    
    
    public void crearPartida(){
        
        servicio.cantidadJugadores();
        servicio.jugadoresDeLaPartida();
        
    }
    
    public void inicioJuego(){
        servicio.ronda();
    }
    
    
    
    public void procesoPrincipal(){
        crearPartida();
        inicioJuego();
    }
            
    
    
    
}
