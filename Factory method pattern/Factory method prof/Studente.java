import java.util.ArrayList;
import java.util.List;


public class Studente implements IStudente {

    private List<Esame> esami = new ArrayList<>();

    //metodo Studente nuovoEsame()
    public void nuovoEsame(String m, int v){
        Esame e = new Esame(m, v);   //creo un istanza di un esame
        esami.add(e);               //inserisco questo esame nella lista
    }

    //metodo Studente getMedia() 
    public float getMedia(){
        if(esami.isEmpty()) return 0;
        float sum = 0;
        for(Esame e: esami) sum += e.getVoto();
        return sum/esami.size();
    }


    
}
