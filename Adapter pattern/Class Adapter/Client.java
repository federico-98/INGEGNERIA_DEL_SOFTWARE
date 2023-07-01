public class Client {
    public static void main(String[] args) {
        Target t = new Adapter("ciao");
        System.out.println( t.request() );
    }
}
