public class Client {

    public static void main (String[] args){

        ILabel s = new Label("LABEL");  //viene creata istanza di Label
        String l = s.getNextLabel();           // viene chiamato il metodo su quell'istanza

        if (l.equals("LAB1")) 
            System.out.println("Test1: Passed");
        else                  
            System.out.println("Test1: Failed");
    }
    
}
