public class Final extends Examen implements Comparable {
    private Double notaOral;
    private String descripcionOral;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    @Override
    public Boolean aprobado() {
        if (getNota() >= 4 && notaOral >= 4) {
            return true;
        } else {
            return false;
        }

    }

    public Double promedio(){
        Double promedio= 0.0;
        promedio = (getNota()+notaOral)/2;
        return promedio;
    }
    @Override
    public int compareTo(Object obj) {
        Final finalX = (Final) obj;
        if(promedio() > finalX.promedio()){
            return 1;
        }
        if(promedio() < finalX.promedio()){
            return -1;
        }else{
            return 0;
        }


    }


}
