// CONCRETE FACTORY 1

public class CCreator1 implements Creator {

    public Icon getIcon() {
        return new Circle1();
    }

    public Text getText() {
        return new Italian1();
    }

}
