public class Client {
    public static void main(String[] args) {
        // Creazione del mediatore (torre di controllo)
        ConcrCentraleControllo torreControllo = new ConcrCentraleControllo();

        // Creazione degli aeromobili (aereo ed elicottero)
        AeroMobile aereoAlpha = new Aereo(torreControllo, "Aereo Alpha");
        AeroMobile elicotteroBravo = new Elicottero(torreControllo, "Elicottero Bravo");

        // Aggiunta aeromobili al mediatore
        torreControllo.aggiungiAeromobile(aereoAlpha);
        torreControllo.aggiungiAeromobile(elicotteroBravo);

        // Comunicazione tra gli aeromobili tramite il mediatore (torre di controllo)
        aereoAlpha.inviaMessaggio("State entrando nello spazio aereo controllato. Ricevete?");
        elicotteroBravo.inviaMessaggio("State avvicinandovi all'area di atterraggio. Ricevete?");
    }
}