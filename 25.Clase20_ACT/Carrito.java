import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private CarritoState estado;
    private List<Producto> productos;

    public Carrito(){
        estado = new Vacio();
        productos = new ArrayList();
    }
    public  void agregarProducto(Producto producto){
        estado = new Cargando();
        productos.add(producto);
    }
    public void vaciarCarrito(){
        estado = estado.cancelarCarrito();
        productos.clear();
    }
    public void pagarCarrito(){
        if(productos.size() > 0){
            estado = estado.irParaAdelante();
        }
    }
    public void volverHaciaAtras(){
        if(estado.getClass().getName().equals("Cargando")){
            this.vaciarCarrito();
        }
            estado.irParaAtras();
    }
    public void finalizarCompra(){
        if(estado.getClass().getName().equals("Pagando")){
            estado = estado.irParaAdelante();
            productos.clear();
            System.out.println("gracias por tu compra!");
        }

    }

    public CarritoState getEstado() {
        return estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
