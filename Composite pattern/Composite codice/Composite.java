import java.util.List;
import java.util.ArrayList;

public class Composite {
    private String nome;
    private List<Component> componenti = new ArrayList<>(); //riferimento al Component, così che 
                                                            //il Composite può gestire sia 
                                                            // LEAF che COMPOSITE
    public Composite(String nome){
        this.nome = nome;
    }

    public void add(Component componente){ //permette di aggiungere un LEAF/COMPOSITE 
        componenti.add(componente);        //al Composite
    }                                      // prende oggetto Component da aggiungere alla lista

    public void remove(Component componente){ //rimuove LEAF/COMPOSITE dalla lista del Composite
        componenti.remove(componente);
    }

    public void operation() {
        System.out.println("Operazione sul Composite: " + nome); //opera prima sul Composite
        for (Component componente : componenti) {                //dopo opera sulla lista
            componente.operation();
        }
    }
}
