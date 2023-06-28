// CONCRETE CREATOR B
public class ConcreteCreatorB implements ShapeCreator{
    public IShape getShape() {
        return new Square();
    }
}
