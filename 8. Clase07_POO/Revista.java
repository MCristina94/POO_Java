public class Revista {

    private String nombre;
    private String codigo;
    private String periodicidad;
    private Edicion edicion;

    public Revista(String nombre, String codigo, String periodicidad, Edicion edicion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        this.edicion = edicion;
    }

    public void crearEdiciones(){
        System.out.println("la Revista ha generado una nueva Edicion " + edicion);
    }
}
