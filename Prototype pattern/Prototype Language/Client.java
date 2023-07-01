public class Client {
    public static void main(String[] args) {
	    
		Language A,B;
		A = new ItalianLanguage("Ciao");
		B = A.clone();
		A.Setword("Questo è l'oggetto originale con il commento cambiato");
		System.out.println(A.Getword());
		System.out.println(B.Getword());
	
	}
}
