public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuarioJuego1 = new UsuarioJuego("pepe", "1234");
        System.out.println("Hola " + usuarioJuego1.getNombre() + " bienvenido al juego");
        usuarioJuego1.subirNivel();
        usuarioJuego1.aumentaPuntaje();
        usuarioJuego1.bonus(3);


    }
}