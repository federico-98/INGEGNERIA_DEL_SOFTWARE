public class testSing {
    public static void main(String[] args) {

        Singleton s= Singleton.getInstance(); //chiamo metodo getInstance per ottenere istanza
        System.out.println("UNICA ISTANZA CREATA: " + s.getValue());


        // cambio istanza
        Singleton s1=Singleton.getInstance();
        s1.setValue(11);

        System.out.println("NUOVA ISTANZA CREATA: " + s1.getValue());


        // cambio ancora l'istanza e la stampo
        Singleton s2= Singleton.getInstance();
        s2.setValue(1000000);
        System.out.println("NUOVA ISTANZA CREATA: " + s2.getValue());
    }
}
