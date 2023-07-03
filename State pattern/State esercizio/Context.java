public class Context {

    State mode = new NonIniziato();
    
    public void setmode(int x){
        if(x == 1){
            mode = new Iniziato();
        }else if(x == 2){
            mode = new Completato();
        }else if(x == 3){
            mode = new NonCompletato();
        }else if(x == 0){
            mode = new NonIniziato();
        }else{
            System.out.print("Inserire un numero intero da 0 a 3.");
        }
    }

    public void esegui(){
        mode.stampa();
    }
}
