public class Accesa implements StatoLampadina {
    
    @Override
    public StatoLampadina accendi () {
        System.out.println(" La lampadina è già accesa ");
        return this;  //adesso lo stato è il medesimo (ACCESO)
    }
    
    @Override
    public StatoLampadina spegni () {
        System.out.println(" La lamapadina è spenta ");
        return new Spenta();
    }

}