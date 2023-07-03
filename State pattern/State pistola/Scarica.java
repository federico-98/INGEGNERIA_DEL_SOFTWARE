public class Scarica  implements StatoPistola {
    
    @Override
    public StatoPistola spara() {
        System.out.println(" La pistola si è inceppata");
        return new Inceppata(); // passa allo stato di pistola INCEPPATA
    }

    @Override
    public StatoPistola ricarica() {
        System.out.println(" Caricamento della pistola avvenuto con successo!!");
        return new Carica();
    }

    
    @Override
    public StatoPistola aggiusta() {
        System.out.println(" La pistola già funziona benissimo");
        return this;    
    }
}
