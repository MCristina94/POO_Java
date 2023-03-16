import java.util.Scanner;

public class CuentaComitente extends Cuenta{
    private String cnv;

    public CuentaComitente(double saldo, String cnv) {
        super(saldo);
        this.cnv = cnv;
    }
    @Override
    public void depositar(double monto){
        super.depositar(monto*0.99);
    }

    @Override
    public void extraer(double monto) {
        Double nuevoSaldo = 0.0;
        if(monto <= (getSaldo()*0.5)){
            System.out.println("su saldo actual es: "+getSaldo());
            nuevoSaldo = getSaldo() - monto;
            setSaldo(nuevoSaldo);
            System.out.println("su nuevo saldo es: "+getSaldo());
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor ingrese el pin: ");
            String pin = scanner.nextLine();

            if(cnv.equals(pin)){
                System.out.println("su saldo actual es:" +getSaldo());
                nuevoSaldo = getSaldo() - monto;
                setSaldo(nuevoSaldo);
                System.out.println("su nuevo saldo es: "+getSaldo());
            }else {
                System.out.println("Pin incorrecto, intentelo de nuevo");
            }

        }
    }
}
