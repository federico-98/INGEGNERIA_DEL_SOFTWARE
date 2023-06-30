// 2) VERSIONE LAZY INIZIALIZATION (istanza creata alla prima chaimata del metodo)
public class Singleton {
    private static Singleton instance;
    private int valore;

    private Singleton(int valore){
        this.valore = valore;
     }

    public static Singleton getInstance(int valore) {
        if(instance==null) instance = new Singleton(valore);
        return instance;
    }

    public int getValore(){
        return valore;
    }
}