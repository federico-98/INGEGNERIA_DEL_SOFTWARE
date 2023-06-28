public class Sospeso implements IStudente{

    private float media;

    public Sospeso(float m){
        media = m;
    }

    // metodo nuovoEsame() 
    public void nuovoEsame(String m, int v){
        System.out.println("NON PUOI SOSTENERE ESAMI");
    }

    // metodo getMedia()
    public float getMedia(){
        return media;
    }






}