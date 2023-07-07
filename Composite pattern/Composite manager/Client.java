public class Client {
    public static void main(String[] args) {

        // Creazione dipendenti
        Component dipendente1 = new Dipendente("Mario Rossi");
        Component dipendente2 = new Dipendente("Luigi Bianchi");

        // Creazione manager
        Manager manager1 = new Manager("Giuseppe Verdi");
        Manager manager2 = new Manager("Antonio Russo");

        // i dipendenti creati precedentemente vengono aggiunti nel team dei manager
        manager1.aggiungiDipendente(dipendente1); // dipendenti 
        manager2.aggiungiDipendente(dipendente2);

        // Stampa della struttura gerarchica(prima sui manager e poi sui dipendenti)
        manager1.stampaNome();
        manager2.stampaNome();
        


    }
}
