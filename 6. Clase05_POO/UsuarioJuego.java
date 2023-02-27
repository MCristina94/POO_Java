public class UsuarioJuego {
        private String nombre;
        private String clave;
        private Double puntaje;
        private int nivel;

        public UsuarioJuego(String nombre, String clave){
            this.nombre = nombre;
            this.clave = clave;
            puntaje = 0.0;
            nivel = 0;
        }

        public void aumentaPuntaje(){
            System.out.println("tu puntaje actual es: " + puntaje);
            puntaje++;
            System.out.println("haz subido el puntaje: "+ puntaje);
        }

        public void subirNivel(){
            System.out.println("tu nivel actual es: " + nivel);
            nivel++;
            System.out.println("haz subido de nivel: "+ nivel);
        }

        public void bonus(int valor){
            System.out.println("tu puntaje actualmente es: " +puntaje);
            puntaje += valor;
            System.out.println("Has ganado un bonus, tu puntaje en este momento es: " + valor);
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public Double setPuntaje(){
            return puntaje;
    }

    public int setNivel() {
        return nivel;
    }
}
