//PROTOTYPE
abstract class Language{ 
    public String word;
    
    public Language(String str){
        word = str;
    }
    
    public void Setword(String str){
        word = str;
    }
    
    public String Getword(){
        return word;
    }
    
    public abstract Language clone();

}
