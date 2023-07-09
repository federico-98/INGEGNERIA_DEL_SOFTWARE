public class Client {
    public static void main(String[] args) {
        
        Colore coloreBase = new ColoreBase();
        Colore coloreMetalizzato = new ColoreMetalizzato();

        Auto ferrari = new Ferrari(coloreBase);
        System.out.println(ferrari.descrizione());

        Auto lamborghini = new Lamborghini(coloreMetalizzato);
        System.out.println(lamborghini.descrizione());

    }
}
