public abstract class Contrato {
    private Persona persona;
    private Integer cantMeses;
    private Integer fechaInicio;
    private Boolean selladoMin;

    public Contrato(Persona persona, Integer cantMeses, Integer fechaInicio, Boolean selladoMin) {
        this.persona = persona;
        this.cantMeses = cantMeses;
        this.fechaInicio = fechaInicio;
        this.selladoMin = selladoMin;
    }

    //Para poder incorporarse al trabajo debe estar sellado en el ministerio de trabajo.
    public Boolean puedeIncorporarse(){
        if(selladoMin){
            return true;
        }else{
            return false;
        }
    }
}
