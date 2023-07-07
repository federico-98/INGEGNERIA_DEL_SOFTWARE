public class Client {
    public static void main(String[] args) {

        // Creazione LEAF 
        Component leaf1 = new Leaf("Foglia 1");
        Component leaf2 = new Leaf("Foglia 2");

        // Creazione COMPOSITE
        Composite composite1 = new Composite("Composite");
        composite1.add(leaf1);
        composite1.add(leaf2);

        // Esecuzione delle operazioni
        composite1.operation();
    }
    
}
