public class LogisticaViaAerea implements Logistica {
    public static Trasporti getTrasporti() {
      return new Aereo();
    }
}
