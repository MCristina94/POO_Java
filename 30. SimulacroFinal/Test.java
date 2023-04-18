public class Test {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();

        UnidadFactory uf1 = UnidadFactory.getInstace();

        empresa1.agregarUnidad(uf1.crearUnidad("MANTENIMIENTO"));
        empresa1.agregarUnidad(uf1.crearUnidad("LIMPIEZA"));
        empresa1.agregarUnidad(uf1.crearUnidad("SERVICIOS-GENERALES"));

        empresa1.imprimirComponentes();
    }
}