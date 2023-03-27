public class Parcial extends Examen{
    private Integer unidad;
    private Integer numeroReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer unidad, Integer numeroReintentos) {
        super(alumno, titulo, enunciado, nota);
        this.unidad = unidad;
        this.numeroReintentos = numeroReintentos;
    }

    @Override
    public Boolean aprobado() {
        if(getNota() >= 4){
            return true;
        }else{
            return false;
        }

    }

    public Boolean esRecuperable(){
        Boolean recuperable = false;

        if(aprobado()){
            recuperable = false;
        }
        else if(unidad <= 3){
            recuperable = numeroReintentos <3;

        }
        else if(unidad > 3){
            recuperable = numeroReintentos <2;
        }
        return recuperable;
    }
}
