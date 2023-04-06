public class Contenedor implements Comparable<Contenedor>{
    private Integer id;
    private String paisProcedencia;
    private Boolean matPeligroso;

    public Contenedor(Integer id, String paisProcedencia, Boolean matPeligroso) {
        this.id = id;
        this.paisProcedencia = paisProcedencia;
        this.matPeligroso = matPeligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        return id.compareTo(o.id);
    }

    public Integer getId() {
        return id;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public Boolean getMatPeligroso() {
        return matPeligroso;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public void setMatPeligroso(Boolean matPeligroso) {
        this.matPeligroso = matPeligroso;
    }
}
