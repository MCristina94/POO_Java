public class Test {
    public static void main(String[] args) {
       Instituto instituto = new Instituto();

       OfertaAcademicaFactory ofertaAcademicaFactory = OfertaAcademicaFactory.getInstace();

       instituto.agregarOFertaAcademica(ofertaAcademicaFactory.crearOfertaAcademica("BACKEND"));
       instituto.agregarOFertaAcademica(ofertaAcademicaFactory.crearOfertaAcademica("FRONTEND"));
       instituto.agregarOFertaAcademica(ofertaAcademicaFactory.crearOfertaAcademica("FULLSTACK"));

       instituto.generarInforme();
    }
}