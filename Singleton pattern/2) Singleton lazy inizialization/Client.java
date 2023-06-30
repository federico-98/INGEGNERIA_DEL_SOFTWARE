public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(10);
        System.out.println("Il valore appena impostato è: " + s1.getValore());
    }
}
