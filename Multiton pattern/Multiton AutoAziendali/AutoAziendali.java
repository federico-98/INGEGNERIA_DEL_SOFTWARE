import java.util.HashMap;
import java.util.Map;

public class AutoAziendali{
  private static Map <String,AutoAziendali> instances = new HashMap<>();
  private String nomeAuto;

  private AutoAziendali(String nomeAuto){
    this.nomeAuto = nomeAuto;
  }
  
  public static AutoAziendali getInstances(String nomeAuto){
    instances.put("Ford", new AutoAziendali("Ford"));
    instances.put("Dacia", new AutoAziendali("Dacia"));
    instances.put("Opel", new AutoAziendali("Opel"));

    return instances.get(nomeAuto);

  }

  public String getNome(){
    return nomeAuto;
  }
}