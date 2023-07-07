public class Client {
    public static void main(String[] args) {
        
        ConcreteRivista cr = new ConcreteRivista(" FORBES ");

        Osservatori abbonato1 = new Abbonati("Mario");
        Osservatori abbonato2 = new Abbonati("Marta");
        Osservatori abbonato3 = new Abbonati("Alfredo");

        cr.attach(abbonato3);
        cr.attach(abbonato1);
        cr.attach(abbonato2);

       System.out.println("\nSTATO RIVISTA --------------------> " + cr.getStato());
       cr.setstato("edizione rivista 2023");
       System.out.println("\nSTATO RIVISTA ATTUALE ------------> " + cr.getStato());



    }
}
