public class Triste implements TamagochiState{
    @Override
    public TamagochiState comer() {
        System.out.println("Beep Beep y vomita");
        return this;
    }

    @Override
    public TamagochiState beber() {
        System.out.println("Beep Beep Beep y titila");
        return this;
    }

    @Override
    public TamagochiState mimos() {
        return new Feliz();
    }
}
