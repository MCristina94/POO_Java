public class Feliz implements TamagochiState{

    @Override
    public TamagochiState comer() {
        return new Sediento();
    }

    @Override
    public TamagochiState beber() {
        return new Hambriento();
    }

    @Override
    public TamagochiState mimos() {
        return this;
    }
}
