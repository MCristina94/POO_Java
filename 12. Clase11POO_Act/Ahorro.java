public class Ahorro extends Cuenta{
    private Double intereses;

    public Ahorro(Double saldo, Double intereses) {
        super(saldo);
        this.intereses = intereses;
    }

    @Override
    public void extraerDinero(Double valor){
        Double nuevoSaldo = 0.0;
        if(valor <= getSaldo()){
            nuevoSaldo = getSaldo() - valor;
            setSaldo(nuevoSaldo);
        } else{
            System.out.println("Saldo insuficiente, intentelo de nuevo con un valor menor");
        }
    }
    public void cobrarIntereses(){
        Double saldoMasIntereses = 0.0;
        saldoMasIntereses = (getSaldo()*intereses) + getSaldo();
        setSaldo(saldoMasIntereses);
    }

}
