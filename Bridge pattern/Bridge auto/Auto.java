//ABSTRACTION
abstract class Auto {
    protected Colore colore;

    public Auto(Colore colore) {
        this.colore = colore;
    }

    public abstract String descrizione();
}