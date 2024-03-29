public abstract class Unidad {
    private String nombre;
    private String descripcion;

    public Unidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularMonto();

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Monto: $" +calcularMonto();
    }
}
