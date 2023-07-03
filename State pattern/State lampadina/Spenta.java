public class Spenta implements StatoLampadina {
    
    @Override
    public StatoLampadina accendi () {
        System.out.println(" La lampadina si è accesa ");
        return new Accesa(); 
    }
    
    @Override
    public StatoLampadina spegni () {
        System.out.println(" La lamapadina è già spenta ");
        return this;
    }

}
