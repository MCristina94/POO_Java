public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("coca cola", 250.00);
        Producto p2 = new Producto("pepsi", 300.00);
        Producto p3 = new Producto("sprite", 450.00);

        Carrito carrito = new Carrito();

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
         // estado cargando
        carrito.volverHaciaAtras();
        //estado vacio y se limpia el array de productos

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        //vuelve a estar cargando

        carrito.pagarCarrito();
        //estado pagando;

        carrito.finalizarCompra();
        //estado cerrado, se limpia el array y sale un mensaje de "gracias por tu compra"

        carrito.agregarProducto(p1);
        //vuelve a estar cargando



        System.out.println(carrito.getEstado());

        System.out.println(carrito.getProductos());
    }
}