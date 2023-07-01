public class Label implements ILabel {

    private LabelServer ls;  //variabile di riferimento
    private String p;

    public Label(String prefix){   //costruttore che prende in ingresso una stringa
        p=prefix;
    }

    public String getNextLabel(){                 
        if (ls==null) ls = new LabelServer(p);   //creo istanza Adaptee
        return ls.serverNextLabel();             //uso il riferimento per chiamre il metodo di Adaptee
    }
}
