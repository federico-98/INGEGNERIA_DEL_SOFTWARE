import java.util.ArrayList;
import java.util.List;

public class Subject{

    private List<Observer> listaOsservatori = new ArrayList<>(); //lista osservatori
    
    public void attach(Observer o){
        listaOsservatori.add(o);
    }

    public void detach(Observer o){
         listaOsservatori.remove(o);
    }

    public void notify(String stato){
        for(Observer o :  listaOsservatori) 
             o.update(stato);
             
    }
}