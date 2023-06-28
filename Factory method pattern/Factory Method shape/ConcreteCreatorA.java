// CONCRETE CREATOR A
public class ConcreteCreatorA implements ShapeCreator{
    public IShape getShape() {
        return new Circle();
    }
}
