// oggetto context
public class Pistola {

    private StatoPistola stato;  //  riferimento allo STATE

    public Pistola () {
        stato = new Carica(); // stato iniziale della pistola
    }


    public void spara() {
        stato = stato.spara();
    }

    public void ricarica() {
        stato = stato.ricarica();
    }

    public void aggiusta() {
        stato = stato.aggiusta();
    }
}
