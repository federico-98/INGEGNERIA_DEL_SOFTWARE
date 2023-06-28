public class Client {
    public static void main(String[] args) {

        //scelgo la consegna per il primo pacco
        Trasporti t1 = Logistica.getTrasporti("Camion");
        System.out.println("PACCO 1 "); 
        t1.consegna();
        
        //scelgo la consegna per il secondo pacco
        Trasporti t2 = Logistica.getTrasporti("Aereo");
        System.out.println("PACCO 2 ");   
        t2.consegna();
    }
}
