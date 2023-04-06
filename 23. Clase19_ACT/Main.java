public class Main {
    public static void main(String[] args) {

        EmpleadoFactory ef1 = EmpleadoFactory.getInstance();

        Empresa empresa1 = new Empresa("SoyMas sas");


        empresa1.addEmpleados(ef1.crearEmpleado("EMP-RD","lolo","lili", 3));
        empresa1.addEmpleados(ef1.crearEmpleado("EMP-RD","lolo","lili", 4));
        empresa1.addEmpleados(ef1.crearEmpleado("EMP-RD","gonza","lili", 5));


        System.out.println(empresa1.calcularSueldosTotal(30));

    }
}