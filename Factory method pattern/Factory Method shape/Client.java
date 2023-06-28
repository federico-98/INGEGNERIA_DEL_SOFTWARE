// CLIENT
public class Client {
    
    public static void main(String[] args) {
        
        // disegna/riempi Cerchio
        ShapeCreator sc1 = new ConcreteCreatorA();
        IShape s1 = sc1.getShape();
        s1.draw();
        s1.fill();
        System.out.println();
        
        // disegna/riempi quadrato
        ShapeCreator sc2 = new ConcreteCreatorB();
        IShape s2= sc2.getShape();
        s2.draw();
        s2.fill();
        System.out.println();

        //disegna/riempi il rettangolo
        ShapeCreator sc3 = new ConcreteCreatorC();
        IShape s3 = sc3.getShape();
        s3.draw();
        s3.fill();
        System.out.println();

    }
}
