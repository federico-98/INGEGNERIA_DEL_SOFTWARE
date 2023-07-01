//CONCRETE FACTORY
public class RepartoMercedes implements Reparto{
     public Motore getMotore(){
       return new MotoreMercedes();
    }

    public Carrozzeria getCarrozzeria(){
        return new CarrozzeriaMercedes();
    }
}
