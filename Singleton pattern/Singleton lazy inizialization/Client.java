public class Client {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance(4);
       System.out.println(" stampo: " + s.getValue());
    }
}
