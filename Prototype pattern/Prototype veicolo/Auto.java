//CONCRETE PROTOTYPE
public class Auto extends Veicolo {

    private int numeroPorte; //variabile aggiuntiva classe Auto

    public Auto(String marca, String modello, int numeroPorte) {
        super(marca, modello); //richiama costruttore superclasse
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public Veicolo clone() {
        return new Auto(getMarca(), getModello(), getNumeroPorte());
    }
}
