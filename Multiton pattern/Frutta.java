// MULTITON
import java.util.HashMap;
import java.util.Map;

public class Frutta{
    private static Map<String, Frutta> instances = new HashMap<>();
    private String nomeFrutta;

    private Frutta(String nomeFrutta){
        this.nomeFrutta = nomeFrutta;
    }
    
    public static Frutta getInstance(String nome) {
       instances.put("Mela", new Frutta("Mela"));
        instances.put("Banana", new Frutta("Banana"));
        instances.put("Pera", new Frutta("Pera"));
        return instances.get(nome);
    }
    
    public String getNome() {
        return nomeFrutta;
    }
}
