public class Corriente extends Cuenta {
    private Double montoAutorizado;


    public Corriente(Double saldo, Double montoAutorizado) {
        super(saldo);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraerDinero(Double valor){
        Double saldoDespuesExtraccion = 0.0;
        if(valor <= getSaldo()){
            saldoDespuesExtraccion = getSaldo() - valor;
            setSaldo(saldoDespuesExtraccion);
        }
        else if(valor <= montoAutorizado){
            Double montoDespuesExtraccion = 0.0;
            montoDespuesExtraccion = montoAutorizado - valor;
        }
        else{
            System.out.println("Saldo y monto insuficiente, vuelva a intentarlo con un retiro de menor valor");
        }
    }
}
