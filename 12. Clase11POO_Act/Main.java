public class Main {
    public static void main(String[] args) {
        Ahorro ahorro1 = new Ahorro(1000.0,0.05);
        Corriente corriente1 = new Corriente(3000.0, 10000.0);
        Cliente cliente1 = new Cliente(1,"Garcia", 123, 001, ahorro1);
        ahorro1.cobrarIntereses();
        System.out.println(ahorro1.getSaldo());
        corriente1.extraerDinero(2000.0);
        System.out.println(corriente1.getSaldo());

    }
}