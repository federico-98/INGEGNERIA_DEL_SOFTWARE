//3) VERSIONE TRED-SAFE (strategia double locking, per evitare il sovraccarico)
// Invocando il metodo getInstance() controlla se la variabileè null, e se lo è 
// crea un istanza della classe all'interno di un "blocco sincronizato", così se
// un altro thread tenta di accedere al metodo getInstance() mentre l'istanza sta venendo creata, 
// viene bloccato fino al completamento della creazione dell'istanza.
public class Singleton 
{
    private static Singleton instance;

    private Singleton(){}

        public static Singleton getInstance()
        {
                if(instance==null)
                {
                    synchronized(Singleton.class) 
                    {
                        if(instance==null) instance = new Singleton();
                    }
                }

          return instance;
        }
}