import java.util.ArrayList;
import java.util.List;

class CartellaFoto implements ElementoGalleria {
    private String nome;
    private List<ElementoGalleria> elementi;

    public CartellaFoto(String nome) {
        this.nome = nome;
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoGalleria elemento) {
        elementi.add(elemento);
    }

     public void rimuoviElemento(ElementoGalleria elemento) {
        elementi.remove(elemento);
    }

    public void mostra() {
        System.out.println("Mostra cartella: " + nome);
        for (ElementoGalleria elemento : elementi) {
            elemento.mostra();
        }
    }

}