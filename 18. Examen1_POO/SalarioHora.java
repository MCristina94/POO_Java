public class SalarioHora extends Contrato implements Comparable {
    private Double horasMes;
    private Double valorHora;

    public SalarioHora(Persona persona, Integer cantMeses, Integer fechaInicio, Boolean selladoMin, Double horasMes, Double valorHora) {
        super(persona, cantMeses, fechaInicio, selladoMin);
        this.horasMes = horasMes;
        this.valorHora = valorHora;
    }

    //Un contrato por horas
    //es mayor a otro de acuerdo a la cantidad de horas contratadas.

    @Override
    public int compareTo(Object obj) {
        SalarioHora shX = (SalarioHora) obj; //casting
        int respuesta = 0;

        if(this.horasMes > shX.horasMes) respuesta = 1;
        if(this.horasMes < shX.horasMes) respuesta = -1;

        return respuesta;
    }
}
