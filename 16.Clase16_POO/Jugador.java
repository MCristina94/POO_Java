public class Jugador implements Comparable<Jugador>{
    private Integer nroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean titular;

    public Jugador(Integer nroCamiseta, String nombre, Boolean lesionado, Boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public Boolean getTitular() {
        return titular;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLesionado(Boolean lesionado) {
        this.lesionado = lesionado;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }

    @Override
    public int compareTo(Jugador o) { // comparar por numero de camiseta

        return nroCamiseta.compareTo(o.nroCamiseta);
    }
}
