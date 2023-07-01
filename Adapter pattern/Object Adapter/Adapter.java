public class Adapter  implements Target {

    private Adaptee adp;  // variabile riferimento  ad Adaptee
    private String p;   

    public Adapter (String prefix) {  // costruttore prende in ingresso una stringa
        p = prefix;                   // e la memorizza  nella variabile privata p
    }


    //IMPLEMENTAZIONE METODO INTERFACCIA
    public String request () {   

        if(adp == null) adp = new Adaptee(p);
        return adp.specificRequest();
    }



    
}
