public class Client {
    public static void main(String[] args) {
        Target t = new Adapter("ciao");
        t.request();

        System.out.println(" output: " + t.request());
    }
}
