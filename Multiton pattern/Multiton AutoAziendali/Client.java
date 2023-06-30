public class Client {
    public static void main(String[] args) {
        AutoAziendali Mario = AutoAziendali.getInstances("Ford");
        AutoAziendali Adriano = AutoAziendali.getInstances("Opel");
        AutoAziendali Luca = AutoAziendali.getInstances("Dacia");

        System.out.println("Mario sta utilizzando: " + Mario.getNome());
        System.out.println("Adriano sta utilizzando: " + Adriano.getNome());
        System.out.println("Luca sta utilizzando: " + Luca.getNome());
    }
}
