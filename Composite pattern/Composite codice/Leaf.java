public class Leaf implements Component {
  private String nome;

  public Leaf(String nome){
    this.nome = nome;
  }

    public void operation(){
       System.out.println("operazione sulla foglia:  " + nome);
    }
}
