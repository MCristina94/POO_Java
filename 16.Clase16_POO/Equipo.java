import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public void addJugadores(Jugador jugador){ // para adicionar al array los jugadores.
        this.jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void mostrarJugadoresTitulares(){
        Collections.sort(jugadores); //Collections.sort(jugadores, Collections.reverseOrder());-->para ir de mayor  a menor
        for(Jugador jugador: this.jugadores){
            if (jugador.getTitular()) {

                System.out.println("Jugador: "+jugador.getNombre() + " Nro " + jugador.getNroCamiseta());
            }
        }
    }
}
