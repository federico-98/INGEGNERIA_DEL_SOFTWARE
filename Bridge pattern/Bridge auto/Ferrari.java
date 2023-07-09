public class Ferrari extends Auto {

    public Ferrari(Colore colore) {
        super(colore);
    }
    
    public String descrizione() {
        return "Ferrari - " + colore.getApplicaColore();
    }
    
}
