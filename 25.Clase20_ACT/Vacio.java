public class Vacio implements  CarritoState{
    @Override
    public CarritoState irParaAdelante() {
        return new Cargando();
    }

    @Override
    public CarritoState irParaAtras() {
        return this;
    }

    @Override
    public CarritoState cancelarCarrito() {
        return this;
    }
}
