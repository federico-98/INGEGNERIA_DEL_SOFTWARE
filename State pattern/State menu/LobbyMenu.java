//CONTEXT
class LobbyMenu{ //Context
    private Phrase selected;
    
    LobbyMenu(){ 
        this.selected = new Greeting();
    }
    
    public void setPhrase(int x){
        if(x == 1){
            selected = new Greeting();
        }else if(x == 2){
            selected = new Goodbye();
        }else{
            System.out.print("setPhrase has an invalid pharameter and thus will take no effect.");
        }
    }
    
    public Phrase getPhrase(){
        return selected;
    }
    
    public void communicate(){
        selected.speak();
    }
    
}