public class Chef {
    private Food food;

    public Chef(Food food)
    {
        this.food=food;
    }

    public void preparazioneCibo(){
        food.preparo();
    }

    public void consegnaCibo(){
        food.consegno();
    }
}
