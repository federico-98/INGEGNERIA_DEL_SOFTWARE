public class Adapter extends Adaptee implements Target {

    public Adapter (String prefix) {
     super(prefix);
    }
    
    public String request () {

        return specificRequest();

    }
    
}
