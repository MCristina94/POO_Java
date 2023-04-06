public class Main {

    public static void main(String[] args) throws ClienteException {
        Cliente cliente1 = new Cliente("ezequiel", "lopez", "25252",100.0);
        System.out.println(cliente1.toString());

        /*cliente1.comprar(50.0);
        System.out.println(cliente1.toString());
        cliente1.comprar(100.0);
        System.out.println(cliente1.toString());*/

        //usando try catch
        try{
            cliente1.comprar(100.0);
        }catch(ClienteException unErrorDeCliente){
            System.out.println("Aqui hice un tray catch y el mensaje es:" +unErrorDeCliente.getMessage());
        }
        cliente1.comprar(50.0);
        System.out.println(cliente1.toString());
        cliente1.comprar(100.0);
        System.out.println(cliente1.toString());
    }
}
