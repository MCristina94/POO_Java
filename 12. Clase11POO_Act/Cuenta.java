public abstract class Cuenta {
    private Double saldo;


    public Cuenta(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void extraerDinero(Double valorExtraer);

    public void depositar(Double valorDeposito){
        saldo += valorDeposito;
    }

    public void informarValor(){
        System.out.println("El valor de su cuenta es de: " +saldo);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
