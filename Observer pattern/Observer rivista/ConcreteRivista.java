public class ConcreteRivista extends Rivista{
    
    public ConcreteRivista(String nome) {
        super(nome);
    }

    public String stato = " edizione rivista 2021\n ";

    public String getStato(){
        return stato;
    }

    public void setstato(String statoAttuale){
        stato=statoAttuale;
        pubblicazioneRivista();
    }
}
