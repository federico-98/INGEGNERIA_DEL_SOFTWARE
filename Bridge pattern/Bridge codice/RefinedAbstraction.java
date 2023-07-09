class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) { //prende un oggetto implementor
        super(implementor); // lo passa al costruttore della superclasse Abstraction
    }

    public void operation() {
        System.out.print("Refined Abstraction: ");
        implementor.implement(); //chiama il metodo implement del ConcreteImplementor
    }
}