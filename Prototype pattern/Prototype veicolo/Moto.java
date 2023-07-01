//CONCRETE PROTOTYPE
class Moto extends Veicolo {
    private boolean Sella2posti; //variabile aggiuntiva classe Moto

    public Moto(String marca, String modello, boolean Sella2posti) {
        super(marca, modello); //per invocare il costruttore della superclasse prototype
        this.Sella2posti = Sella2posti;
    }

    public boolean getSella2posti() {
        return Sella2posti;
    }

    @Override
    public Veicolo clone() {
        return new Moto(getMarca(), getModello(), getSella2posti());
    }
}
