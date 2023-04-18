public class Simple extends Unidad{
    private Double montoPersonal;
    private Double cantPersonas;

    public Simple(String nombre, String descripcion, Double montoPersonal, Double cantPersonas) {
        super(nombre, descripcion);
        this.montoPersonal = montoPersonal;
        this.cantPersonas = cantPersonas;
    }

    @Override
    public Double calcularMonto() {
        if(cantPersonas<10){
            return montoPersonal*cantPersonas;
        }else {
            return (montoPersonal + (montoPersonal*0.20))* cantPersonas;
        }
    }
}
