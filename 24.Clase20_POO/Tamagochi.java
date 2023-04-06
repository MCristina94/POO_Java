public class Tamagochi {
    private TamagochiState estadoActual;

    public Tamagochi() {
       estadoActual = new Feliz();
    }

    public void darComer(){
        estadoActual = estadoActual.comer();
    }
    public void darBeber(){
        estadoActual = estadoActual.beber();
    }
    public void darMimos(){
        estadoActual = estadoActual.mimos();
    }

}
