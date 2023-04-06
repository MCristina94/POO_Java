public class EmpleadoFactory {
    private static EmpleadoFactory instance;

    private EmpleadoFactory(){} //constructor privado vacio

    public static EmpleadoFactory getInstance(){
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo, String nombre, String apellido, Integer legajo){
        switch (codigo){
            case "EMP-RD":
               return new EmpleadoRelacionDependencia(nombre, apellido, legajo, 1000.0);
            case "EMP-PH":
                return new EmpleadoContratado(nombre, apellido, legajo,7.0,14.0);
            default:
                System.out.println("ups, no contamos con ese tipo de contratación, intente de nuevo");

        }

        return null;
    }
}
