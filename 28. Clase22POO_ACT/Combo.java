import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{
    private List<Comprable> productos;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        productos = new ArrayList<>(); //instanciar la lista
    }

    public void agregarcomprable(Comprable comprable){
        productos.add(comprable);
    }
    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        System.out.println("encontre un combo!");
        for (Comprable producto : productos) {
            precioTotal += producto.calcularPrecio();
        }
        Double precioFinal = precioTotal - precioTotal*descuento;
        System.out.println("El precio con descuento del combo es: " +precioFinal);
        return precioFinal;
    }
}
