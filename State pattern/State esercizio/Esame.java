//TRASFORMA QUESTO CODICE IN STATE PATTERN
class Esame{
    boolean iniziato;
    boolean completo;
     
    public void inizio(){
        if(!iniziato){
            System.out.print("Sto inziando");
            iniziato = true;
        }else{
            System.out.print("Non e' possibile iniziare");
        }
    }    
        
    public void completo(){
        
        if(iniziato && !completo){
            System.out.print("Sto completando");
        }else{
            System.out.print("Non e' possibile completare.");
        }
    }
}





