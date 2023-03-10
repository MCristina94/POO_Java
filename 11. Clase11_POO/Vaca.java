public class Vaca extends Animal{
    private Integer peso;

    public Vaca(String nombre, Integer energia, Integer peso) {
        super(nombre, energia);
        this.peso = peso;
    }

    @Override
    public void hacerRuido(){
        System.out.println("muuuuuu"); //abstracto
    }
    @Override
    public void comer(Integer pesoComida){ //sobreescribir
        super.comer(pesoComida);
        peso += pesoComida/2;
    }
}
