public class Fib{

    private static Fib obj= new Fib();

    private int[] x = {1,2,3,4,9,8};

    private int i; //indice


    private Fib()
    {
        i=3;  //setto l'indice a 3
    }

    public static Fib getInstance(){
        return obj;
    }

    public int getValue(){

        if(i<4) i++;
        return x[i-1];
    }

    public void revert()
    {
        i=0;
    }


}