import java.util.ArrayList;
import java.util.List;

public class Recorrido {

    static final String buenosAires = "Buenos Aires";
    static final String lujan = "Lujan";
    static final String mercedes = "Mercedes";
    static final String suipacha = "Suipacha";
    static final String chivilcoy = "Chivilcoy";
    static final String alberti = "Alberti";
    static final String bragado = "Bragado";

    static final List<String> estaciones = new ArrayList<>(List.of(buenosAires, lujan, mercedes, suipacha, chivilcoy, alberti, bragado));
    private String estacionPartida;
    private String estacionDestino;

    public Recorrido(String estacionPartida, String estacionDestino) {
        this.estacionPartida = estacionPartida;
        this.estacionDestino = estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
}
