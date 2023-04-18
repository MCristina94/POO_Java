public class UnidadFactory {
    private static UnidadFactory instace;

    private UnidadFactory(){}

    public static UnidadFactory getInstace(){
        if( instace == null){
            return new UnidadFactory();
        }
        return instace;
    }

    public Unidad crearUnidad(String codigo){
        switch (codigo){
            case "MANTENIMIENTO":
                return new Simple("Mantenimiento", "Area mto", 120000.0,4.0);
            case "LIMPIEZA":
                return new Simple("Limpieza", "area limpieza", 100000.0, 24.0);
            case "SERVICIOS-GENERALES":
                Combinada combinada = new Combinada("servicios generales", "cuenta con dos servicios", 3.0, 0.0 );
                combinada.agregarUnidad(crearUnidad("MANTENIMIENTO"));
                combinada.agregarUnidad(crearUnidad("LIMPIEZA"));
                return combinada;
        }
        return null;
    }
}
