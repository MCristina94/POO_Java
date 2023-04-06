import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    private String nombrePuerto;
    private ArrayList<Contenedor> contenedores;

    public Puerto(String nombrePuerto) {
        this.nombrePuerto = nombrePuerto;
        this.contenedores = new ArrayList<>();
    }

    //El sistema debe permitir que el puerto pueda ingresar contenedores, mostrarlos
    //ordenados de acuerdo al número que los identifica y poder calcular la cantidad de
    //contenedores peligrosos cuya procedencia sea “Desconocida”.
    public void addContenedores(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }

    public ArrayList<Contenedor> getContenedores() {
        return contenedores;
    }

    public void mostrarContenedores(){
        Collections.sort(contenedores);
        for(Contenedor contenedor: this.contenedores){
            System.out.println("Contenedor: "+ contenedor.getId());
        }
    }
    public void contenedoresPeligrososDesconocidos(){
        int contenedoresPD = 0;
        for(Contenedor contenedor : this.contenedores){
            if (contenedor.getMatPeligroso() && contenedor.getPaisProcedencia().toLowerCase().equals("desconocida")) {
                contenedoresPD++;
            }
        }
        System.out.println(contenedoresPD);
    }

}
