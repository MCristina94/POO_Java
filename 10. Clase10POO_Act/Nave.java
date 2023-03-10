public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }


    public void girar(char direccion){
        this.setDireccion(direccion);
    }

    public void irA(int x, int y, char nuevaDireccion){
        if(this.getDireccion()!= nuevaDireccion){
            girar(nuevaDireccion);
        }
        this.setPosx(x);
        this.setPosy(y);

    }

    public int restarVida(int valor){
        return vida -= valor;
    }

}
