import java.time.LocalDate;
public class Adopcion {
    private Boolean enAdopcion;
    private String raza;
    private Integer anioNacimientoAprox;
    private Double peso;
    private Boolean chipPerro;
    private Boolean lastimado;
    private String nombrePila;

    public Adopcion(Boolean enAdopcion, String raza, Integer anioNacimientoAprox, Double peso, Boolean chipPerro, Boolean lastimado, String nombrePila){
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioNacimientoAprox = anioNacimientoAprox;
        this.peso = peso;
        this.chipPerro = chipPerro;
        this.lastimado =lastimado;
        this.nombrePila = nombrePila;
    }

    public Integer edadDelPerro(){
        Integer edadPerro = 0;
        return edadPerro = LocalDate.now().getYear() - anioNacimientoAprox;
    }
    public Boolean factibleDePerderse(){
        return !chipPerro;
    }
    public Boolean factibleDeAdopcion(){
        if(!lastimado && peso>5 ){
            return true;
        }else{
           return false;
        }
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getNombrePila() {
        return nombrePila;
    }
}
