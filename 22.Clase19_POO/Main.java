public class Main {
    public static void main(String[] args) {
        ProductoFactory productoFactory1 = ProductoFactory.getInstance();

        Almacen almacenNuevo = new Almacen();

        almacenNuevo.agregarProducto(productoFactory1.crearProducto("CAJA10X10"));
        almacenNuevo.agregarProducto(productoFactory1.crearProducto("PELOTAFUTBOL"));
        almacenNuevo.agregarProducto(productoFactory1.crearProducto("PELOTATENIS"));

        System.out.println(almacenNuevo.calculcarEspacioNecesario());
    }

}
