import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Jugador messi = new Jugador(10,"Lio",false, true);
        Jugador falcao = new Jugador(9,"Ramadel",false, true);
        Jugador suarez = new Jugador(11,"Luis",true, true);

        Equipo laMejorCamada1 = new Equipo("LaMejorCamada1");

        laMejorCamada1.addJugadores(messi);
        laMejorCamada1.addJugadores(falcao);
        laMejorCamada1.addJugadores(suarez);

        System.out.println(laMejorCamada1.getJugadores());

        ArrayList<Jugador> listaJugadores = laMejorCamada1.getJugadores();

       /* for(int i = 0; i < listaJugadores.size() ; i++){ // for convencional
            System.out.println("Juador: "+ listaJugadores.get(i).getNombre());
        }*/

        for(Jugador jugador : listaJugadores ){  // for each
            System.out.println("Juador: "+ jugador.getNombre());
        }

        laMejorCamada1.mostrarJugadoresTitulares();

    }

}