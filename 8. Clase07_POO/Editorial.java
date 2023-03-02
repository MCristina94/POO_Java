public class Editorial {

    private String nombre;
    private Revista revista;

    public Editorial(String nombre, Revista revista) {
        this.nombre = nombre;
        this.revista = revista;
    }

    public void posteaRevistas(){
        System.out.println("Se ha publicado una nueva Revista: " + revista);
    }
}
