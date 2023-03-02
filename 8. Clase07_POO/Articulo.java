
public class Articulo {

    private String titulo;
    private String tema;
    private String autor;
    private Integer fechaArticulo;

    public Articulo(String titulo, String tema, String autor, Integer fechaArticulo) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fechaArticulo = fechaArticulo;
    }

    public void escribeArticulos(){
        System.out.println("Nuevos articulos para la edición");
    }
}
