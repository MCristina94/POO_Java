public class Main {
    public static void main(String[] args) {
        Producto hamburguesa = new Producto("hamburguesa", 20000.0);
        Producto papasFritas = new Producto("papasFritas", 7000.0);
        Producto gaseosa = new Producto("gaseosa", 2000.0);
        Producto helado = new Producto("helado", 15000.0);

        Combo combo1 = new Combo(0.10);
        combo1.agregarcomprable(hamburguesa);
        combo1.agregarcomprable(papasFritas);
        combo1.agregarcomprable(gaseosa);

        Combo comboPareja = new Combo(0.20);
        comboPareja.agregarcomprable(combo1);
        comboPareja.agregarcomprable(combo1);

        Carrito carrito = new Carrito();
        carrito.agregarcomprable(combo1);
        carrito.agregarcomprable(comboPareja);
        carrito.agregarcomprable(papasFritas);
        carrito.agregarcomprable(combo1);

        System.out.println(carrito.calcularPrecioFinal());

    }
}