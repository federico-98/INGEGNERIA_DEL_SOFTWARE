public class Client {
    public static void main(String[] args) {

        //AUTO
        Veicolo autoPrototipo = new Auto("Fiat", "Punto", 5);
        Veicolo auto1 = autoPrototipo.clone();
        
        //MOTO
        Veicolo motoPrototipo = new Moto("Honda", "CBR", true);
        Veicolo moto1 = motoPrototipo.clone();

        System.out.println("AUTO 1: " + auto1.getMarca() + " " + auto1.getModello() + "    Porte: " + ((Auto) auto1).getNumeroPorte());
        System.out.println("MOTO 1: " + moto1.getMarca() + " " + moto1.getModello() + "     Sella a due posti: " + ((Moto) moto1).getSella2posti());
    }
}