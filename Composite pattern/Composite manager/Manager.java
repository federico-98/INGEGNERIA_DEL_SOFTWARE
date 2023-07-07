import java.util.ArrayList;
import java.util.List;

// COMPOSITE
public class Manager implements Component {

    private String nome;
    private List<Component> dipendenti = new ArrayList<>();

    public Manager(String nome) {
        this.nome = nome;
    }

    public void aggiungiDipendente(Component dipendente) {
        dipendenti.add(dipendente);
    } 

    public void rimuoviDipendente(Component dipendente) {
        dipendenti.remove(dipendente);
    }

    public void stampaNome() {
        System.out.println("Manager: " + nome);
        for (Component dipendente : dipendenti) {
            dipendente.stampaNome();
        }
    }
}
