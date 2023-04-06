public class Main {
    public static void main(String[] args) throws EmpresaException {

        String buenosAires = Recorrido.buenosAires;
        String lujan = Recorrido.lujan;
        String mercedes = Recorrido.mercedes;
        String suipacha = Recorrido.suipacha;
        String chivilcoy = Recorrido.chivilcoy;
        String alberti = Recorrido.alberti;
        String bragado = Recorrido.bragado;

        Empresa empresa1 = new Empresa("viajes y eventos");

        Reserva reserva1 = new Reserva("C1", 10, new Recorrido(buenosAires,bragado)); //40 * 10 = 400
        Reserva reserva2 = new Reserva("C2", 100, new Recorrido(lujan, mercedes)); // 50 * 100 = 5000
        Reserva reserva3 = new Reserva("C3", 50, new Recorrido(alberti, buenosAires)); // 50 * 50 = 2500
        Reserva reserva4 = new Reserva("C4", 40, new Recorrido(bragado, chivilcoy)); // 50 * 40 = 2000

        empresa1.addReservas(reserva1);
        empresa1.addReservas(reserva2);
        empresa1.addReservas(reserva3);
        empresa1.addReservas(reserva4);

        System.out.println(empresa1.cantVecesRecorrida(bragado));
        System.out.println(empresa1.recaudoTotal());
        System.out.println(reserva1.precioReserva());




    }
}