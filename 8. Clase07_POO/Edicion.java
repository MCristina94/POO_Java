public class Edicion {

    private Integer numeroEdicion;
    private Integer fechaEdicion;
    private Double precio;
    private Articulo articulo;

    public Edicion(Integer numeroEdicion, Integer fechaEdicion, Double precio, Articulo articulo) {
        this.numeroEdicion = numeroEdicion;
        this.fechaEdicion = fechaEdicion;
        this.precio = precio;
        this.articulo = articulo;
    }
    public void adicionaArticulos(){
        System.out.println("Esta edicion ha adicionado articulos");
    }
}
