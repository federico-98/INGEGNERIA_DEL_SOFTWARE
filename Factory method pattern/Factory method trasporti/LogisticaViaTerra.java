public class LogisticaViaTerra implements Logistica {
    public static Trasporti getTrasporti() {
      return new Camion();
    }
}
