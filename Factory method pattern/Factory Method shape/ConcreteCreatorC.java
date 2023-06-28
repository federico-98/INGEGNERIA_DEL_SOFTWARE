// CONCRETE CREATOR C
public class ConcreteCreatorC implements ShapeCreator {
    
    public IShape getShape () {

        return new Rectangle();
    }
}
