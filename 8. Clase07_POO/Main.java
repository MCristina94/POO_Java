public class Main {
    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("baby", "infancia", "pedro", 2020);
        Edicion edicion1 = new Edicion(001,2020, 2000.0, articulo1 );
        Revista revista1 = new Revista("infancia", "1123", "Fulano", edicion1);
        Editorial editorial1 = new Editorial("Nono", revista1);

        editorial1.posteaRevistas();

    }
}