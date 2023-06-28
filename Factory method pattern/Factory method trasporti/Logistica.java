public interface Logistica {

    public static Trasporti getTrasporti(String mezzo)
    {
        Trasporti t=null; //devo inizializzarla a null inizialmente

        if(mezzo.equals("Aereo")) t = LogisticaViaAerea.getTrasporti(); 
        if(mezzo.equals("Camion")) t = LogisticaViaTerra.getTrasporti();
        if(mezzo.equals("Nave")) t = LogisticaViaMare.getTrasporti();

        return t; //devo ritornare un tipo Trasporti

    }


}
