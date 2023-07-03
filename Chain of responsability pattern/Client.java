public class Client {
    public static void main(String[] args) {
        GestoreRichiesta gestoreMario = new GestoreMario();
        GestoreRichiesta gestoreLuigi = new GestoreLuigi();

        // Mario non può gestire la richiesta e la passa a Luigi
        gestoreMario.setSuccessore(gestoreLuigi);


        // Simulazione di richieste
        gestoreMario.RichiestaPer("Mario"); // gestoreMario="Mario"(Puo gestire)

        gestoreMario.RichiestaPer("Luigi"); // gestoreMario="Luigi"(non può gestire)
                                                      // e la passa a gestoreLuigi

        gestoreMario.RichiestaPer("Giovanni"); // nessun gestore può gestire "Giovanni"
                                                         // e si genera un messaggio predefinito                            
    }
}
