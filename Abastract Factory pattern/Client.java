public class Client {
    public static void main(String[] args) {
        
        //Concrete Factory 1
        Creator c1 = new CCreator1();
        Icon i1 = c1.getIcon();
        Text t1 = c1.getText();

        i1.draw();
        i1.fill();

        t1.arrivederci();
        t1.benvenuti();

        System.out.println("\n");

        //Concrete Factory 2
        Creator c2 = new CCreator2();
        Icon i2 = c2.getIcon();
        Text t2 = c2.getText();

        i2.draw();
        i2.fill();

        t2.arrivederci();
        t2.benvenuti();







    }
}
