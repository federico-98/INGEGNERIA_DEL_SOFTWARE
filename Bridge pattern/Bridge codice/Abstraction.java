//classe/comportamenti con cui interagirà il cliente 
abstract class Abstraction {  
    protected Implementor implementor;//riferimento per stabilire una connessione 
    //Abstraction utilizza implementor per eseguire operazioni specifiche per implementazione 

    public Abstraction(Implementor implementor) { //prende come parametro un oggetto Implementor
        this.implementor = implementor;           
    }
    public abstract void operation(); //operazione di alto livello che il cliente invocherà
}