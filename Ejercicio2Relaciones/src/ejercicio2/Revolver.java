package ejercicio2;

public class Revolver {

    private int posicionDisparador, posicionBala;
    
    
    public Revolver() {
    }

    public Revolver(int posicionDisparador, int posicionBala) {
        this.posicionDisparador = posicionDisparador;
        this.posicionBala = posicionBala;
    }

    public int getPosicionDisparador() {
        return posicionDisparador;
    }

    public void setPosicionDisparador(int posicionDisparador) {
        this.posicionDisparador = posicionDisparador;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public void llenarRevolver() {
        posicionBala = (int) (Math.random() * 6 + 1);
        posicionDisparador = (int) (Math.random() * 6 + 1);

    }
    
    public boolean mojar(){
        return(posicionBala==posicionDisparador);
    }
    
    public void moverTambor(){
        if(posicionBala==6){
            posicionBala=0;
        }else{
            posicionBala++;
        }
        
        if(posicionDisparador==6){
            posicionDisparador=0;
        }else{
            posicionDisparador++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionDisparador=" + posicionDisparador + ", posicionBala=" + posicionBala + '}';
    }
    
    

}
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
