//1) VERSIONE EAGER (istanza creata durante la creazione della classe)
public class Singleton {
    private static Singleton instance = new Singleton(10); //riferimento istanza
    private int valore; //valore dll'istanza


    private Singleton(int valore) {
        this.valore=valore;
    }
   
    public static Singleton getInstance(){
        return instance;
    }

   public int getValore() // metodo aggiuntivo per ritornare valore istanza
   {
       return valore;
   }

    public void setValore(int valore){ //metodo aggiuntivo per settare il valore dell'istanza
        this.valore= valore;
    }
    
}