
public class Singleton {

    private static Singleton s= new Singleton(200); //creo istanza e la memorizzo nella variabile privata e statica

    private int i;


    private Singleton(int x)
    {
        i=x;
    }

    public static Singleton getInstance()  //metodo statico per accedere all'istanza
    {
        return s;
    }

    public int getValue()
    {
        return i;
    }

    public void setValue(int x)
    {
        i=x;
    }






    
}