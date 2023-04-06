public class EmpleadoRelacionDependencia extends Empleado {
    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }


    @Override
    public Double calcularSueldo(int dias) {
        return (sueldoMensual/30) * dias;
    }

    @Override
    public String toString() {
        return "EmpleadoRelacionDependencia{" + getNombre() +
                "sueldoMensual=" + sueldoMensual +
                '}' + '\n' ;
    }
}
