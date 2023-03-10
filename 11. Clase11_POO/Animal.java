public abstract class Animal {
    private String nombre;
    private Integer energia;

    public Animal(String nombre, Integer energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public void comer(Integer pesoComida){
        energia += pesoComida;

    }

    public abstract void hacerRuido();

}
