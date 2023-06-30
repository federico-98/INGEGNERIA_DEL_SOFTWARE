public interface Reparto {
    
    public static Vettura getVettura(String vettura){
       Vettura v= null;

       if(vettura.equals("Ferrari"))        v=RepartoFerrari.getVettura();
       else if (vettura.equals("Mercedes")) v=RepartoMercedes.getVettura();
       else if (vettura.equals("Mclaren"))  v=RepartoMclaren.getVettura();
       else if (vettura.equals("Audi"))     v=RepartoAudi.getVettura();

       return v;
    }
}
