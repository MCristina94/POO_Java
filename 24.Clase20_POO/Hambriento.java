public class Hambriento implements TamagochiState {
    @Override
    public TamagochiState comer() {
        return new Feliz();
    }

    @Override
    public TamagochiState beber() {
        return new Triste();
    }

    @Override
    public TamagochiState mimos() {
        return this;
    }
}
