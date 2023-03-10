public class Cliente {
    private Integer numeroCliente;
    private String apellido;
    private Integer dni;
    private Integer cuit;

    private Cuenta cuenta;

    public Cliente(Integer numeroCliente, String apellido, Integer dni, Integer cuit, Cuenta cuenta) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.cuenta = cuenta;
    }
}
