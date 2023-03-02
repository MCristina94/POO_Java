public class Main {
    public static void main(String[] args) {
        Adopcion perro1 = new Adopcion(true, "pitbull", 2015, 8.0, false, true,"peter");

        System.out.println("La edad de "+ perro1.getNombrePila()+ " es: "+ perro1.edadDelPerro());

        if(perro1.factibleDePerderse()){
            System.out.println(perro1.getNombrePila() + " SI es factible de perderse");
        }else{
            System.out.println(perro1.getNombrePila() + " NO es factible que se pierda");
        }

        if (perro1.factibleDeAdopcion()){
           System.out.println(perro1.getNombrePila() + " puede ser adoptado(a)");
       }else{
           System.out.println(perro1.getNombrePila() + " no se encuentra en condiciones para ser adoptado(a)");
       }

    }
}