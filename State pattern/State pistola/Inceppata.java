public class Inceppata implements StatoPistola {
    @Override
    public StatoPistola spara() {
        System.out.println(" La pistola è inceppata! Non posso sparare! ");
        return this; // mi riferisco all stessa classe Inceppata
    }

    @Override
    public StatoPistola ricarica() {
        System.out.println(" La pistola è inceppata! Non posso ricaricare! ");
        return this;
    }

    
    @Override
    public StatoPistola aggiusta() {
        System.out.println(" Pistola sistemata correttamente, ma devi ricaricare!");
        return new Scarica();    
    }
}
