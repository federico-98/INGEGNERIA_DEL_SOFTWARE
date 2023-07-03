public class Lampadina {
    private StatoLampadina stato = new Spenta(); // la setto inizialmente spenta

    public void accendi() {
        stato = stato.accendi();
    }

    public void spegni() {
        stato = stato.spegni();
    }

}