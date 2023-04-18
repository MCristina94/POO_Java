public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instace;

    private OfertaAcademicaFactory(){}

    public static OfertaAcademicaFactory getInstace(){
        if ( instace == null){
            return new OfertaAcademicaFactory();
        }
        return instace;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo){
        switch (codigo){
            case "FRONTEND":
                return new Curso("Front-End", "javaScript", 16.0, 1000.0,2.0);
            case "BACKEND":
                return new Curso("Back-End", "java", 20.0, 900.0, 2.0);
            case "FULLSTACK":
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("full stack", "completo", 0.20);
                programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica("FRONTEND"));
                programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica("BACKEND"));
                return programaIntensivo;
        }
        return null;
    }
}
