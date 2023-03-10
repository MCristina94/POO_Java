public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave(1,1,'N',12, 0);
        System.out.println(nave1.getPosx());
        System.out.println(nave1.getPosy());
        System.out.println(nave1.getDireccion());
        nave1.girar('S');
        System.out.println(nave1.getDireccion());

        nave1.irA(3,2,'O');
        System.out.println(nave1.getDireccion());
        System.out.println(nave1.getPosx());
        System.out.println(nave1.getPosy());
    }
}