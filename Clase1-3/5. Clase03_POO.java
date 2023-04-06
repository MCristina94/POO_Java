import java.util.Scanner;

public class Clase03_POO {
    public static void main(String[] args){

        /*En la veterinaria tienen perros de diferentes tipos. Cada uno de ellos come una cantidad fija de
        alimento balanceado por día. El proveedor de alimentos le envía un pack con diferentes
        cantidades de alimento. En cada uno hay sobres con pequeñas raciones para que se consuman
        por cada día, sabiendo que deben darles por lo menos 3 kg por día para que cada perro no se
        sienta con hambre y ladre toda la noche.
        Precisamos hacer un programa que nos ayude a simular la situación: Pedirá primero el nombre
        y la cantidad de comida que come el perro. La idea es que mediante una función llamada
        cuantosPaquetes indique el nombre y cuantos paquetes usará. Dada la cantidad necesaria la
        función cuantosPaquetes pedirá uno a uno los pesos de cada paquete hasta llegar a esa
        cantidad y retorna el número de paquetes que precisó.
        Ejemplo:
        Rintintin come 4 kg diarios.
        paquetes : 1.2 0.7 1.1 1.3
        resultado: Rintintin precisa 4 paquetes.*/

        //pedir nombre
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su mascota: ");
        String nombre = scanner.nextLine();
        //System.out.println("tu mascota se llama: " + nombre);

        //pedir comida
        System.out.println("Ingrese la cantidad de comida que come su mascota: ");
        Double cantidadComida = scanner.nextDouble();
        //System.out.println("Y come: " + cantidadComida);

        //utilizo la funcion cuantosPaquetes

        Integer paquetesTotales = cuantosPaquetes(cantidadComida);
        System.out.println(nombre + " precisa " + paquetesTotales + " paquetes.");
    }
    public static Integer cuantosPaquetes(Double comidaQueRequiere){
        Scanner scanner = new Scanner(System.in);
        int paquetesTotales = 0;
        Double comidaTotalPaquetes = 0.0;
        while (comidaQueRequiere > comidaTotalPaquetes){
            System.out.println("Cuanto pesa el paquete que le vas a dar?");
            Double pesoPaquete = scanner.nextDouble();
            comidaTotalPaquetes += pesoPaquete;
            paquetesTotales++;

        }
        return paquetesTotales;
    }
}
