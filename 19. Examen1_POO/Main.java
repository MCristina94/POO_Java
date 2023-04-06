public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("lolo", "lopez", 123, 25);
        Contrato contrato1 = new SalarioHora(persona1, 10,2020,true,48.0,25000.0);
        Contrato contrato2 = new SalarioMensual(persona1, 12,2010, false, 50000.0,20.0, "JEFE");
        SalarioMensual salario1 = new SalarioMensual(persona1, 12,2010, false, 50000.0,20.0, "operador");

        SalarioHora sh1 = new SalarioHora(persona1, 10,2020,true,150.0,25000.0);
        SalarioHora sh2 = new SalarioHora(persona1, 25,2018,true,150.0,25000.0);

        System.out.println(contrato1.puedeIncorporarse());
        System.out.println(contrato2.puedeIncorporarse());
        System.out.println(salario1.esJefe());

        if(sh1.compareTo(sh2) > 0){
            System.out.println("El contrato sh1 es mayor al contrato sh2");
        }else if(sh1.compareTo(sh2) < 0){
            System.out.println("El contrato sh2 es mayor al contrato sh1");
        }else{
            System.out.println("Los contratos son iguales");
        }

    }
    
}