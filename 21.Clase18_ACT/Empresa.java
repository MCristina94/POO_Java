import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Reserva>  reservas;
    private List<Recorrido> estaciones;


    public Empresa(String nombre){
        this.nombre = nombre;
        estaciones = new ArrayList<Recorrido>();
        reservas = new ArrayList<Reserva>();
    }

    public void addReservas(Reserva reserva){
        reservas.add(reserva);
    }

    public void addEstaciones(Recorrido estacion){
        estaciones.add(estacion);
    }

    //La explotación del método recaudacionTotal que retorne el monto total recaudado
    //según el precio de todas las reservas.

    public Double recaudoTotal(){
        Double ventaTotal = 0.0;
        for (Reserva reservas: this.reservas) {
            ventaTotal += reservas.precioReserva();
        }
        return ventaTotal;
    }
    //La explotación del método cantVecesRecorrida que reciba una estación por
    //parámetro y retorna cuántas personas pasarán por esa estación, de acuerdo a las
    //reservas existentes (si subieron o bajaron en esa estación). Si el parámetro recibido
    //no corresponde a ninguna de las estaciones, arrojar una excepción.

    public Integer cantVecesRecorrida(String estacion) throws EmpresaException{
        if(!Recorrido.estaciones.contains(estacion)){
            throw new EmpresaException(estacion + " no pertenece a nuestras rutas");
        }
        Integer cantPersonasEstacion = 0;
        for (Reserva reserva: this.reservas) {
            if(reserva.getRecorrido().getEstacionDestino().equals(estacion) || reserva.getRecorrido().getEstacionPartida().equals(estacion)){
                cantPersonasEstacion += reserva.getCantPasajeros();
            }
        }
        return cantPersonasEstacion;
    }

}
