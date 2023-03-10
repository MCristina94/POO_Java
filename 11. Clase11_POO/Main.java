public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Pato("Lucas", 100);
        Animal animal2 = new Vaca("Lola", 100, 300);
        animal1.comer(20);
        animal1.hacerRuido();
        animal2.hacerRuido();



    }
}