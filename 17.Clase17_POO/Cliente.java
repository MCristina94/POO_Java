public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private double deuda;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite= limite;
        deuda=0.0;

    }
    public void comprar(double importe) throws ClienteException {
        if(deuda+importe > limite){
            throw new ClienteException("hey te pasaste del limite");
        }
        deuda+=importe;
    }
    public void saldarDeuda(double importe)
    {
        deuda-=importe;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nombre + ' ' +
                apellido + ' ' +
                ", su deuda es=" + deuda + "$ }";
    }

}
