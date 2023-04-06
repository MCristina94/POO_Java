public class Reserva {
    private String codigo;
    private Integer cantPasajeros;
    private Recorrido recorrido;
    private Double precioBoleto;

    public Reserva (String codigo, Integer cantPasajeros, Recorrido recorrido){
        this.codigo = codigo;
        this.cantPasajeros = cantPasajeros;
        this.recorrido = recorrido;
        precioBoleto = 50.0;
    }

    //Para calcular el precio de una reserva debe multiplicarse la cantidad de personas por el
    //precio del boleto, el cual es de $50. Si el viaje fue de cabecera a cabecera (por ahora,
    //Buenos Aires-Bragado o viceversa) se ofrece un 20% de descuento.
    public Double precioReserva(){
        Double precioReserva = 0.0;
        if((recorrido.getEstacionPartida().equals("Buenos Aires") && recorrido.getEstacionDestino().equals("Bragado")) || (recorrido.getEstacionPartida().equals("Bragado") && recorrido.getEstacionDestino().equals("Buenos Aires")) ){
            precioReserva = (precioBoleto * 0.8) * cantPasajeros;
        }else{
            precioReserva = precioBoleto * cantPasajeros;
        }
        return precioReserva;

    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public Integer getCantPasajeros() {
        return cantPasajeros;
    }
}
