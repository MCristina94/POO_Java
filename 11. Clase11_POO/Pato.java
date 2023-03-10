public class Pato extends Animal{
    public Pato(String nombre, Integer energia) {
        super(nombre, energia);
    }

    public void nadar(){
        System.out.println("Estoy nadando");
    }

    @Override
    public void hacerRuido(){
        System.out.println("Cuack Cuack!!");
    }
}
