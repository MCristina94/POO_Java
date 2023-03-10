import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        SocioPileta socioPileta1 = new SocioPileta(2000.0, true, 1, "pepa", 4000.0, "nadar");
        System.out.println(socioPileta1.calcularCostoMensual());
    }
}