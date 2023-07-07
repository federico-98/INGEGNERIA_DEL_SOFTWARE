//LEAF
public class Dipendente implements Component {
    private String nome;

    public Dipendente(String nome) {
        this.nome = nome;
    }

    public void stampaNome() {
        System.out.println("Dipendente: " + nome);
    }
} 
    

