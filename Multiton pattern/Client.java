public class Client {
    public static void main(String[] args) {
     
        Frutta mela = Frutta.getInstance("Mela");
        Frutta banana = Frutta.getInstance("Banana");
        Frutta pera = Frutta.getInstance("Pera");
        
        System.out.println(mela.getNome()); // Output: Mela
        System.out.println(banana.getNome()); // Output: Banana
        System.out.println(pera.getNome()); // Output: Pera
        
       
    }
    
}
