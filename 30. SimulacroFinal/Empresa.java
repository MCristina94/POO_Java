import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Unidad> unidadList;

    public Empresa(){
        unidadList = new ArrayList<>();
    }
    public void agregarUnidad(Unidad unidad){
        unidadList.add(unidad);
    }

    public void imprimirComponentes(){
        for (Unidad unidad : unidadList) {
            System.out.println(unidad.toString());
        }

    }
}
