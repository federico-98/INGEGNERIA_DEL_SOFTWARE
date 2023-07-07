//SUBJECT
import java.util.ArrayList;
import java.util.List;

public class Rivista{

    private List<Osservatori> listaAbbonati = new ArrayList<>();
    private String nomeRivista; 
    private String stato;
    

    public Rivista(String nomeRivista) {
        this.nomeRivista = nomeRivista;
    }

    public void attach(Osservatori o){

        listaAbbonati.add(o);
        System.out.println("La tua iscrizione è stata effettuata con successo!");
    }

    public void detach(Osservatori o){
        listaAbbonati.remove(o);
        System.out.println("La tua cancellazione è stata effettuata con successo!");
    }

  
    public void notify(String stato){
        for(Osservatori o: listaAbbonati)
              o.update(stato);
    }

    public void pubblicazioneRivista(){
         System.out.println("La rivista " + nomeRivista + " è stata publicata\n");
         notify(stato);
    }

}