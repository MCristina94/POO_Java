public class CargaFactory {
    public static CargaFactory instance;

    private CargaFactory(){}

    public static CargaFactory getInstance(){
        if(instance == null){
            return new CargaFactory();
        }
        return instance;
    }

    public Carga crearCarga(String codigo){
        switch (codigo){
            case "TV32":
                return new Simple("TV 32' LCD", "televisor hogar - carga fragil", 3.0, false);
            case "MEDICAMENTOS":
                return new Simple("Caja de medicamentos", "carga delicada y refrigerada", 2.0, true);
            case "TV-MED":
                Contenedor contenedor = new Contenedor("Carga Combinada", "tv y medicamentos", 100.0 );
                contenedor.agregarCarga(crearCarga("TV32"));
                contenedor.agregarCarga(crearCarga("MEDICAMENTOS"));
                return contenedor;
        }
        return null;
    }
}
