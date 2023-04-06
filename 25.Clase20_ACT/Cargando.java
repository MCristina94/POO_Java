public class Cargando implements  CarritoState{
    @Override
    public CarritoState irParaAdelante() {
        return new Pagando();
    }

    @Override
    public CarritoState irParaAtras() {
        return new Vacio();
    }

    @Override
    public CarritoState cancelarCarrito() {
        return new Vacio();
    }
}
