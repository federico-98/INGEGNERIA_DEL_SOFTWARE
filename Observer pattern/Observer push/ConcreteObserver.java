public class ConcreteObserver implements Observer {

    private String nome;

    public ConcreteObserver(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String stato) {
        System.out.println("Osservatore " + nome + " ha ricevuto un aggiornamento: " + stato);
    }
}
