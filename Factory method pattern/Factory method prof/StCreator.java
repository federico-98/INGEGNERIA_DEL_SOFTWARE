public class StCreator {

    private static float v = 0;
    
    public static IStudente getStudente(){
        if(v==0) return new Studente();
        else     return new Sospeso (v);

    }
}
