//FACADE
public class Squadre{
  private Juventus j = new Juventus();
  private Inter i = new Inter();
  private Milan m = new Milan();


  public void comunicazioneJuventus(){
    j.contratto();
  }

  public void comunicazioneInter(){
    i.contratto();
  }

  public void comunicazioneMilan(){
    m.contratto();
  }
}