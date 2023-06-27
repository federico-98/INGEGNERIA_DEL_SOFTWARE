public class Singleton {

    private static Singleton instance; // riferimento instanza

    private int i; //dati instanza

    private Singleton(int x) { 
        i=x; 
    }

    public static Singleton getInstance(int x) {
        if(instance==null) instance = new Singleton(x);
        return instance;
        }

     public int getValue()
     {
        return i;
     }   

}