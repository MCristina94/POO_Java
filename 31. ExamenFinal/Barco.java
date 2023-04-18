import java.util.ArrayList;
import java.util.List;

public class Barco {
    private List<Carga> cargaList;

    public Barco() {
        cargaList = new ArrayList<>();
    }

    public void agregarCarga(Carga carga){
        cargaList.add(carga);
    }

    public void mostrarCargas(){
        for (Carga carga : cargaList) {
            System.out.println(carga);
        }
    }
}
