public class Main {
    public static void main(String[] args) {
        Contenedor contenedor1 = new Contenedor(1,"desconocida", true);
        Contenedor contenedor2 = new Contenedor(2,"Rusia", true);
        Contenedor contenedor3 = new Contenedor(3,"eeuu", false);
        Contenedor contenedor4 = new Contenedor(4,"japon", true);
        Contenedor contenedor5 = new Contenedor(5,"eeuu", false);

        Puerto puertoX = new Puerto("puerto1");

        puertoX.addContenedores(contenedor1);
        puertoX.addContenedores(contenedor2);
        puertoX.addContenedores(contenedor3);
        puertoX.addContenedores(contenedor4);
        puertoX.addContenedores(contenedor5);

        puertoX.contenedoresPeligrososDesconocidos();
        puertoX.mostrarContenedores();

    }
}