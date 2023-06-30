public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println("Il valore dell'istanza è: " + s1.getValore());
        
        //CAMBIO IL VALORE DELL'ISTANZA
        s1.setValore(100);
        System.out.println("Adesso il valore dell'istanza è: " + s1.getValore());

    }
}
