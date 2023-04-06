import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }

    public void addEmpleados(Empleado empleado){
        empleados.add(empleado);
    }

    public Double calcularSueldosTotal(int dias){
        Double sueldosTotal = 0.0;
        for (Empleado empleado : empleados) { //iter
            sueldosTotal += empleado.calcularSueldo(dias);
        }
        return sueldosTotal;
    }


    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
