public class Objeto {

    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion){
        System.out.println("EL objeto cambio de posición y dirección");

    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
}

