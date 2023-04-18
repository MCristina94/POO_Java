import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private Double descuento;
    private List<OfertaAcademica> ofertaAcademicaList;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        ofertaAcademicaList = new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica oferta){
        ofertaAcademicaList.add(oferta);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertaAcademicaList) {
            precioTotal += (ofertaAcademica.calcularPrecio()) - (ofertaAcademica.calcularPrecio()) * descuento;
        }


        return precioTotal;
    }
}
