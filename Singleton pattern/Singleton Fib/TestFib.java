public class TestFib {

    public static void main(String[] args) {

        Fib f= Fib.getInstance();
        System.out.println("RISULTATO: " + f.getValue());

        f.revert();

        System.out.println("RISULTATO DOPO REVERT: " + f.getValue());
    }
    
}
