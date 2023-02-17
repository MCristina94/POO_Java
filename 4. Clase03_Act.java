import java.util.Scanner;

public class Clase03_Act {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        //Pedir nombre
        System.out.println("Ingresar el nombre del jugador 1");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingresar el nombre del jugador 2");
        String nombre2 = scanner.nextLine();

        String jugada1 = "";
        String jugada2 = "";
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;

        //Ejecución del ejercicio 1
        do {
            System.out.println( nombre1 +" ingresa tu jugada (1 para piedra, 2 para tijera y 3 para papel)");
            jugada1 = scanner.nextLine().trim();
            System.out.println(nombre2 +" ingresa tu jugada (1 para piedra, 2 para tijera y 3 para papel)");
            jugada2 = scanner.nextLine().trim();



            Integer ganador = cualGana(jugada1,jugada2);
            if(ganador == 1){
                puntosJugador1++;
            }else if(ganador == 2){
                puntosJugador2++;
            }else{
                puntosJugador1 += 0;
                puntosJugador2 += 0;
            }
        }while( !jugada1.equals("*") && !jugada2.equals("*"));

        if (puntosJugador1 > puntosJugador2){
            System.out.println("El ganador es: " +nombre1);
        }else if (puntosJugador2 > puntosJugador1){
            System.out.println("El ganador es: " +nombre2);
        }else{
            System.out.println("Es un empate!");
        }

        System.out.println("puntos jugador1 " + puntosJugador1 + " y puntos jugador2 " +puntosJugador2);

        //Ejecución ejercicio 2
        do {
            System.out.println( nombre1 +" ingresa tu jugada (1 para piedra, 2 para tijera, 3 para papel y 4 para spock)");
            jugada1 = scanner.nextLine().trim();
            System.out.println(nombre2 +" ingresa tu jugada (1 para piedra, 2 para tijera, 3 para papel y 4 para spock)");
            jugada2 = scanner.nextLine().trim();

            Integer ganador = cualGana(jugada1,jugada2);
            if(ganador == 1){
                puntosJugador1++;
            }else if(ganador == 2){
                puntosJugador2++;
            }else{
                puntosJugador1 += 0;
                puntosJugador2 += 0;
            }
        }while( !jugada1.equals("*") && !jugada2.equals("*"));

        if (puntosJugador1 > puntosJugador2){
            System.out.println("El ganador es: " +nombre1);
        }else if (puntosJugador2 > puntosJugador1){
            System.out.println("El ganador es: " +nombre2);
        }else{
            System.out.println("Es un empate!");
        }

        System.out.println("puntos jugador1 " + puntosJugador1 + " y puntos jugador2 " +puntosJugador2);

        //ejecución del ejercicio 3

        System.out.println("Ingrese cuantos numeros primos desea visualizar: ");
        Integer cantPrimos = scanner.nextInt();
        cantidadPrimos(cantPrimos);

        //ejecución del ejercicio 4
        System.out.println("Hola Julieta, cuantas horas laboraste esta semana en la empresa? ");
        int horasJulieta = scanner.nextInt();
        System.out.println("Julieta, tu sueldo esta semana será de: " + sueldoJulieta(horasJulieta));


    }



    /*Desafío 1
Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
cuando el primero elije “*” como indicador de final.*/

    public static Integer cualGana(String jugadaGamer1, String jugadaGamer2){

       if (jugadaGamer1.equals(jugadaGamer2) || jugadaGamer1.equals("*") || jugadaGamer2.equals("*")) {
           return 0;
       } else if (jugadaGamer1.equals("1")  && jugadaGamer2.equals("2") || jugadaGamer1.equals("3") && jugadaGamer2.equals("1") ||
               jugadaGamer1.equals("2") && jugadaGamer2.equals("3") ) {
           return 1;
       } else {
          return 2;
       }

    }
/*Desafío 2
Modificá la función cualGana del Desafío 1 para jugar la variante Spock: Hay una
posibilidad más, el señor Spock —formado por la mano Vulcana de Star Trek— tiene otros
poderes según:
Papel desaprueba Spock
Spock destroza tijeras
Spock vaporiza piedra*/

    public static Integer cualGanaSpock(String jugadaGamer1, String jugadaGamer2){

        if (jugadaGamer1.equals(jugadaGamer2) || jugadaGamer1.equals("*") || jugadaGamer2.equals("*")) {
            return 0;
        } else if (jugadaGamer1.equals("1")  && jugadaGamer2.equals("2") || jugadaGamer1.equals("3") && jugadaGamer2.equals("1") ||
                jugadaGamer1.equals("2") && jugadaGamer2.equals("3") || jugadaGamer1.equals("3") && jugadaGamer2.equals("4") ||
                jugadaGamer1.equals("4") && jugadaGamer2.equals("1") || jugadaGamer1.equals("4") && jugadaGamer2.equals("2") ) {
            return 1;
        } else {
            return 2;
        }

    }


/*Desafío 3
Implementar un programa que nos permite mostrar por consola los primeros “n” números
primos, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13,
17”.*/


    public static void cantidadPrimos(int numero){
        int contador = 0;
        for(int i = 2; contador < numero; i++){
            if(esPrimo(i)){
                contador++;
                //System.out.println(i);
            }

        }
    }
    public static Boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

    }



/*Desafío 4
Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
hora semanal es de 875.*/

    public static Double sueldoJulieta(int horasTrabajadas){
        double sueldo = 0;
        double sueldoExtra = 0;
        if(horasTrabajadas <= 40){
            sueldo = horasTrabajadas * 875;
        } else if( horasTrabajadas > 40){
            int horasAdicionales = horasTrabajadas - 40;
            sueldoExtra = horasAdicionales * (875 * 0.5);
            sueldo = ( horasTrabajadas * 875 ) + sueldoExtra;

        }
        return sueldo;
    }

}
