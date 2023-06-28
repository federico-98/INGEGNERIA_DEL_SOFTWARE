public class ChefSpecializzati {
    
    // reparto chef specializzati in pizze
    public static Chef chefPizza() {
        return new Chef(new Pizza());
    }
    
    // reparto chef specializzati in panini
    public static Chef chefPanino() {
        return new Chef(new Panino());
    }
    
}
