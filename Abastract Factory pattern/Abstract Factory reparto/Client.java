public class Client {
    public static void main(String[] args) {

        //FERRARI
        Reparto repFer = new RepartoFerrari();
        Motore motFer = repFer.getMotore();
        Carrozzeria carFer = repFer.getCarrozzeria();
        motFer.consegno();
        carFer.consegno();
        
        //MERCEDES
        Reparto repMer = new RepartoMercedes();
        Motore motMer = repMer.getMotore();
        Carrozzeria carMer = repMer.getCarrozzeria();
        motMer.consegno();
        carMer.consegno();
    }
}
