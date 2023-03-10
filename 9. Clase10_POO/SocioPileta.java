public class SocioPileta extends Socio {
    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(Double costoPileta, Boolean estaHabilitado, Integer numeroSocio, String nombre, Double coutaMensual,  String actividad){
        super(numeroSocio, nombre, coutaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    public Double calcularCostoMensual(){
        if(estaHabilitado){
            return costoPileta + super.calcularCostoMensual();
        }else{
            return super.calcularCostoMensual();
        }
    }
}
