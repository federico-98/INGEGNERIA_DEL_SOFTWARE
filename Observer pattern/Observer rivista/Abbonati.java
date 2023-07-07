public class Abbonati implements Osservatori {

 private String nome;

  public Abbonati(String nome){
    this.nome = nome;
  }

    public void update(String stato) {
        System.out.println("[NOTIFICA]: " + nome + ", è uscita una nuova rivista!");
    }
}
