public class Client {
    public static void main(String[] args) {
        Chef chefPizza = ChefSpecializzati.chefPizza();
        Chef chefPanino =ChefSpecializzati.chefPanino();

       //PIZZA
        chefPizza.preparazioneCibo();
        chefPizza.consegnaCibo();

        System.out.println("----------------------------");

       //PANINO
        chefPanino.preparazioneCibo();
        chefPanino.consegnaCibo();
    }
}
