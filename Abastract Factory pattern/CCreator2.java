// CONCRETE FACTORY 2

public class CCreator2 implements Creator {

    public Icon getIcon() {
        return new Box2();
    }

    public Text getText() {
        return new English2();
    }
    
}
