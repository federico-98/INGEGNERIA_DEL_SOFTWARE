//CONCRETE PROTOTYPE
class ItalianLanguage extends Language{
    // IL prototipo delle parole italiane il quale resituera' un'istanza di se stesso con il clone
    
    public ItalianLanguage(String str){
        super(str);
    }
    
    @Override
    public Language clone(){
        ItalianLanguage word = new ItalianLanguage(this.Getword());
        return word;
    }
}
