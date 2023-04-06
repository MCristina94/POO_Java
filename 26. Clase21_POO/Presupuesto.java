public class Presupuesto implements ServiceState{

    @Override
    public ServiceState agregarRepuestos() {
        return this;
    }

    @Override
    public ServiceState cambiarDireccion() {
        return this;
    }

    @Override
    public ServiceState valorPresupuesto(Double valor) {
        return ;
    }

    @Override
    public ServiceState siguientePaso() {
        return null;
    }
}
