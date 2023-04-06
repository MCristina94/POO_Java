import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, ¿cúal es tu nombre?");

        String nombre = scanner.nextLine();

        System.out.println("¿Cúal es tu edad");

        Integer edad = scanner.nextInt();

        if (esDivisible(edad, 2) == true){
            System.out.println("tu edad es par");

        }else{
            System.out.println("tu edad es impar");
        }

        //Bucles

        //for (int i = 0; i<10; i++){
            //System.out.println(i);
      //  }

    }
    //Funciones (van por fuera del public static void main)

    public static Boolean esDivisible(int num1, int num2 ){
        if(num1 % num2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}