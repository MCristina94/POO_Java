import org.w3c.dom.ls.LSOutput;

public class Clase02_Act {

    public static void main(String[] args) {

        //llamando esPrimo
       if (esPrimo(7)) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }

        //llamando numeroMax
        System.out.println("el numero max es: " + numeroMax(5,10,15));

        //llamando cadenasDeTextoDistintas

        System.out.println(cadenasDeTextoDistintas("perro", "perro"));

    }

        /*
        Ejercicio 1
Hacer una función que dado un número indica si es un número primo o no. Un número
primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
17.
Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
divisor)*/

    public static Boolean esPrimo(int numero) {

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

    }
/*Ejercicio 2
Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
unNumeroC)
Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
el resultado.*/

    public static Integer numeroMax(Integer num1, Integer num2, Integer num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }else if(num2>num3){
            return num2;
        }else{
            return num3;
        }

    }



/*
Ejercicio 3
Escribir una función:
boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
false, en caso de que coincidan.
  */
    public static Boolean cadenasDeTextoDistintas(String text1, String text2){
        if (text1 != text2){
            return true;
        }else{
            return false;
        }
    }


    }

