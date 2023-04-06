
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SeleccionException{
        String arquero = Jugador.arquero;
        String defensor = Jugador.defensor;
        String mediocampista = Jugador.mediocampista;
        String delantero = Jugador.delantero;

        Seleccion argentina = new Seleccion("Argentina");

        //Titulares
        argentina.convocar(new Jugador(arquero,"Martinez",23));
        argentina.convocar(new Jugador(defensor,"Montiel",4));
        argentina.convocar(new Jugador(defensor,"Romero",13));
        argentina.convocar(new Jugador(defensor,"Otamendi",19));
        argentina.convocar(new Jugador(defensor,"Acuña",8));
        argentina.convocar(new Jugador(mediocampista,"De Paul",7));
        argentina.convocar(new Jugador(mediocampista,"Paredes",5));
        argentina.convocar(new Jugador(mediocampista,"Lo Celso",20));
        argentina.convocar(new Jugador(delantero,"Messi",10));
        argentina.convocar(new Jugador(delantero,"Martinez",22));
        argentina.convocar(new Jugador(delantero,"Di Maria",11));

        // Suplentes
        argentina.convocar(new Jugador(arquero,"Armani",1));
        argentina.convocar(new Jugador(defensor,"Molina",26));
        argentina.convocar(new Jugador(defensor,"Pezzella",6));
        argentina.convocar(new Jugador(mediocampista,"Rodriguez",18));
        argentina.convocar(new Jugador(mediocampista,"Gómez",24));
        argentina.convocar(new Jugador(delantero,"Correa",21));
        argentina.convocar(new Jugador(delantero,"Aquero",9));

        // Reserva
        argentina.convocar(new Jugador(arquero,"Musso",28));
        argentina.convocar(new Jugador(defensor,"Martinez",25));
        argentina.convocar(new Jugador(mediocampista,"Palacios",14));
        argentina.convocar(new Jugador(delantero,"Correa",16));
        argentina.convocar(new Jugador(delantero,"Alvarez",27));

        // Arqueros = 3, Defensores = 7, Mediocampistas = 6, Delanteros = 7

        System.out.println(argentina.obtenerReservas());

        System.out.println(argentina.cantJugadores(arquero));
        System.out.println(argentina.cantJugadores(defensor));

        //ejemplo con try catch
        try{
            System.out.println(argentina.cantJugadores("Arquero"));
        }catch (SeleccionException e){
            System.out.println(e.getMessage()); // el mensaje tambien puedo escribirlo asi: System.out.println("no hay jugadores con esa posicion");
        }


    }
}
