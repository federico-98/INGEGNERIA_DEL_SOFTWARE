import java.util.ArrayList;
import java.util.List;

public class ConcrCentraleControllo implements CentraleControllo {

    private List<AeroMobile> aeromobili = new ArrayList<>();// lista AeroMobili registrati

    @Override
    public void inviaMessaggio(String messaggio, AeroMobile aeromobile) { //(messaggio, mandante)
        for (AeroMobile aero : aeromobili) {
            if (aero != aeromobile) { // invia il messaggio a tutti, tranne se stesso
                aero.riceviMessaggio(messaggio); // invia il messaggio a tutti gli AeroMobili
            }
        }
    }

    public void aggiungiAeromobile(AeroMobile aeromobile) {
        aeromobili.add(aeromobile);
    }
}
