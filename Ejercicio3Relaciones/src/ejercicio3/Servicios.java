package ejercicio3;

public class Servicios {
    
    private Baraja servicio;

    public Servicios() {
        this.servicio = new Baraja();
                
    }
    
    
    
    public void procesoCreacion(){
        
        servicio.crearMazo();
        servicio.barajarCartas();
        
    }
    
    public void procesoDeInteraccion(){
        servicio.mostrarMazo();
        servicio.darCartas();
        servicio.mostarMazoRetirado();
        servicio.cartasDisponibles();
        servicio.siguienteCarta();
        servicio.mostarMazoRetirado();
        servicio.mostrarMazo();
        
    }

}
