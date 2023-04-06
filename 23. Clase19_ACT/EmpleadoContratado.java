public class EmpleadoContratado extends Empleado{
  private Double importePorHora;
  private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(int dias) {
        return (importePorHora*8*dias) * (1-(retencionImpuesto/100));
    }

    @Override
    public String toString() {
        return "EmpleadoContratado{" + getNombre() +
                "importePorHora=" + importePorHora +
                ", retencionImpuesto=" + retencionImpuesto +
                '}' + '\n';
    }
}
