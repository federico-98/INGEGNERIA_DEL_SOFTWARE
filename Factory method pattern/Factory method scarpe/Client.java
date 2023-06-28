public class Client {
    public static void main(String[] args) {

       /*  1) MODO 1 OVVERO SE NON AVESSI DICHIARATO STATIC GETSCARPE

        Commesso c = new Commesso();
        IScarpe t = Commesso.getScarpe("ginnastica");
        System.out.println(t.getClass());

        */

        IScarpe t = Commesso.getScarpe("eleganti");
        System.out.println(t.getClass());



    }
    
}