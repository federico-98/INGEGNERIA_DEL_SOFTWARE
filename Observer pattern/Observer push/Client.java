 public class Client {
    public static void main(String[] args) {
        // Creazione del soggetto concreto
        ConcreteSubject concrSub = new ConcreteSubject ();

        // Creazione osservatori
        Observer osservatore1 = new ConcreteObserver ("Marco");
        Observer osservatore2 = new ConcreteObserver("Andrea");

        // Aggiunta degli osservatori al soggetto
        concrSub.attach(osservatore1);
        concrSub.attach(osservatore2);

        // Cambio dello stato del soggetto e notifica agli osservatori
        concrSub.setStato("Nuovo stato");

        // Rimozione di un osservatore dal soggetto
        concrSub.detach(osservatore2);

        // Cambio dello stato del soggetto e notifica agli osservatori rimanenti
       concrSub.setStato("Altro stato");

       System.out.println("GET STATO: " + concrSub.getState());
    }
} 
    

