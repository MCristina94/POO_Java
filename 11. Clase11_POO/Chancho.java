public class Chancho extends Animal{
    public Chancho(String nombre, Integer energia) {
        super(nombre, energia);
    }

    @Override
    public void hacerRuido(){
        System.out.println("oing oing");
    }

}
