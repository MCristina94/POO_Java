import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Comprable> productos;

    public Carrito(){
        productos = new ArrayList<>();
    }

    public void agregarcomprable(Comprable comprable){
        productos.add(comprable);
    }
    public Double calcularPrecioFinal(){
        Double precioTotal = 0.0;
        for (Comprable producto : productos) {
            precioTotal += producto.calcularPrecio();
        }
        return precioTotal;
    }

}
