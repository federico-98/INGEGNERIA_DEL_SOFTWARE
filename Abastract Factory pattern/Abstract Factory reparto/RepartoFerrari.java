//CONCRETE FACTORY
public class RepartoFerrari implements Reparto {

    public Motore getMotore(){
       return new MotoreFerrari();
    }

    public Carrozzeria getCarrozzeria(){
        return new CarrozzeriaFerrari();
    }
}
