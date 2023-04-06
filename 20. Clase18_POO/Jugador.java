public class Jugador {

    static final String arquero="ARQUERO";
    static final String defensor="DEFENSOR";
    static final String mediocampista="MEDIOCAMPISTA";
    static final String delantero="DELANTERO";
    private String posicion;
    private String apellido;
    private Integer nroCamiseta;

    public Jugador(String posicion, String apellido, Integer nroCamiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion='" + posicion + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nroCamiseta=" + nroCamiseta +
                '}' + '\n';
    }

    public String getPosicion() {
        return posicion;
    }
}
