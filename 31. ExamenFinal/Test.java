public class Test {
    public static void main(String[] args) {
        Barco barcoDH = new Barco();
        CargaFactory cf1 = CargaFactory.getInstance();

        barcoDH.agregarCarga(cf1.crearCarga("TV32"));
        barcoDH.agregarCarga(cf1.crearCarga("MEDICAMENTOS"));
        barcoDH.agregarCarga(cf1.crearCarga("TV-MED"));

        barcoDH.mostrarCargas();
    }
}