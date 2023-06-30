public class Client {
    public static void main(String[] args) {
        
        System.out.println("\n");
        
        Vettura vet1 = Reparto.getVettura("Ferrari");
        vet1.prepara();
        vet1.conserva();

        System.out.println("\n");

        Vettura vet2 = Reparto.getVettura("Audi");
        vet2.prepara();
        vet2.conserva();

        System.out.println("\n");
    }
}
