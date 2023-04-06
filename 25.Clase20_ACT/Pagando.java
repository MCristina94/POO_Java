public class Pagando implements  CarritoState{
    @Override
    public CarritoState irParaAdelante() {
        return new Cerrado();
    }

    @Override
    public CarritoState irParaAtras() {
        return new Cargando();
    }

    @Override
    public CarritoState cancelarCarrito() {
        return new Vacio();
    }
}
