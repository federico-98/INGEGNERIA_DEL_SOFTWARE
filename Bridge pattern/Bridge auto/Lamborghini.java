public class Lamborghini extends Auto {
    
    public Lamborghini(Colore colore) {
        super(colore);
    }
    
    public String descrizione() {
        return "Lamborghini - " + colore.getApplicaColore();
    }
    
}
