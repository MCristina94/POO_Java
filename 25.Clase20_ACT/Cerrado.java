public class Cerrado implements  CarritoState {
    @Override
    public CarritoState irParaAdelante() {
        return new Vacio();
    }

    @Override
    public CarritoState irParaAtras() {
        return this;
    }

    @Override
    public CarritoState cancelarCarrito() {
        return new Vacio();
    }
}
