public class Simple extends Carga {

    private Double pesoCarga;
    private Boolean refrigerado;

    public Simple(String nombre, String descripcion, Double pesoCarga, Boolean refrigerado) {
        super(nombre, descripcion);
        this.pesoCarga = pesoCarga;
        this.refrigerado = refrigerado;
    }

    @Override
    public Double calcularPeso() {
        if(refrigerado){
            return pesoCarga + 2;
        }else{
            return pesoCarga;
        }

    }
}
