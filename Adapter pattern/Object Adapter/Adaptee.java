public class Adaptee {
    private int adapterNum = 1;  // dati della classe 
    private String adapterPrefix; 

    public Adaptee ( String prefix) {
        adapterPrefix = prefix;
    }
    
    public String specificRequest() {
        return adapterPrefix + " " + adapterNum;
    }

}
