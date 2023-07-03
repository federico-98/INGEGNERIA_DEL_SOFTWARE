public class Client {
    public static void main(String[] args) {
        Pistola pist = new Pistola();
        pist.spara(); // STATO CARICA --> STATO SCARICA
        pist.spara(); // STATO SCARICA --> STATO INCEPPATA
        pist.aggiusta();// STATO INCEPPATA --> STATO SCARICA
        pist.ricarica();// STATO SCARICA --> STATO CARICA 
    }
}
