public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory() { //constructor privado vacio
    }
    public static ProductoFactory getInstance(){
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto(String codigo){
        switch (codigo){
            case "CAJA10X10":
                return new Caja(20.0,10.0,10.0,10.0);
            case "PELOTAFUTBOL":
                return new Pelota(2.0, 11.0);
            case "PELOTATENIS":
                return new Pelota(3.0, 0.32);
            default:
                System.out.println("ups, no tenemos ese producto");
                return null;
        }

    }
}
