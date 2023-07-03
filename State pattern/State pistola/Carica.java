public class Carica implements StatoPistola {
    
    @Override
    public StatoPistola spara() {
        System.out.println(" La pistola sta sparando ------->");
        return new Scarica(); // dopo aver sparato da CARICA la pistola passa allo stato di pistola SCARICA
    }

    @Override
    public StatoPistola ricarica() {
        System.out.println(" La pistola è già carica");
        return this;
    }

    
    @Override
    public StatoPistola aggiusta() {
        System.out.println(" La pistola già funziona benissimo");
        return this;    
    }
}
