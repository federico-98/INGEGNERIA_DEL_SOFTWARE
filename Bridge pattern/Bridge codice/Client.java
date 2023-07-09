public class Client {
    public static void main(String[] args) {

        //1)creo istanze per le implementazione concrete
        Implementor implementorA = new ConcreteImplementorA(); 
        Implementor implementorB = new ConcreteImplementorB();
        
        //2)creo un istanza di RefinedAbstraction e passo come parametro implementorA
        Abstraction abstractionA = new RefinedAbstraction(implementorA);
        abstractionA.operation();
        
        //3)creo un istanza di RefinedAbstraction e passo come parametro implementorB
        Abstraction abstractionB = new RefinedAbstraction(implementorB);
        abstractionB.operation();
    }
}