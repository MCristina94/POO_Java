public class SalarioMensual extends Contrato{
    private Double salario;
    private Double horasTotales;
    private String cargo;

    public SalarioMensual(Persona persona, Integer cantMeses, Integer fechaInicio, Boolean selladoMin, Double salario, Double horasTotales, String cargo) {
        super(persona, cantMeses, fechaInicio, selladoMin);
        this.salario = salario;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public Boolean esJefe(){

        if(cargo.toLowerCase().equals("jefe")){
            return true;
        }else{
            return false;
        }
    }
}
