Esimport java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String nombre;
    private List<Jugador> plantel;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<Jugador>();
    }

    public void convocar(Jugador unJugador){
        plantel.add(unJugador);
    }

    //La programación del método obtenerReservas que devuelva (no muestre por consola) a
    //todos los jugadores de reserva de la selección.

    public List<Jugador> obtenerReservas(){
        List<Jugador> reservas = new ArrayList<>();
        for (Integer indiceJugador = 18; indiceJugador < 23; indiceJugador++){ //posicion de las reservas adicionadas en main
            reservas.add(plantel.get(indiceJugador));
        }

        return reservas;
    }

    //La programación del método cantJugadores que recibe como parámetro una posición y
    //devuelva la cantidad de jugadores en esa posición. Si la posición no es ninguna de las
    //mencionadas arrojar una excepción.

    public Integer cantJugadores(String posicion) throws SeleccionException{
        if(!posicion.equals(Jugador.arquero)&&!posicion.equals(Jugador.mediocampista)&&!posicion.equals(Jugador.defensor)&&!posicion.equals(Jugador.delantero)){
            throw new SeleccionException("No hay jugadores en la posicion: "+ posicion);
        }
        Integer jugadoresPosicion = 0;
        for (Jugador jugador: plantel){
            if(jugador.getPosicion().equals(posicion))
                jugadoresPosicion++;
        }
        return jugadoresPosicion;
    }

}
