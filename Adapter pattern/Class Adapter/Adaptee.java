public class Adaptee {
    
    private static int adapterNum = 1;
    private static String adapterPrefix;

    public Adaptee (String prefix) {
        adapterPrefix  = prefix;
    }

    public static String specificRequest() {
        return adapterPrefix + " " + adapterNum; 
    }
}
