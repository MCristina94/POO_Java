public class Service {
    private Double valorRepuesto;
    private String direcciónEntrega;
    private ServiceState estadoActual;
    private String nombreProducto;

    public Service(String nombreProducto, String direcciónEntrega, Double valorRepuesto){
        this.nombreProducto = nombreProducto;
        this.valorRepuesto = valorRepuesto;
        this.direcciónEntrega = direcciónEntrega;
        estadoActual = new Presupuesto();
    }

    public void setValorRepuesto(Double valorRepuesto) {
        this.valorRepuesto = valorRepuesto;
    }

    public void setDirecciónEntrega(String direcciónEntrega) {
        this.direcciónEntrega = direcciónEntrega;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
