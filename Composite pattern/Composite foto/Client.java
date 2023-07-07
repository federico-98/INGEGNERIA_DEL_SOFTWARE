public class Client {
    public static void main(String[] args) {
         // Creazione di foto singole
         ElementoGalleria foto1 = new Foto("Vacanza1.jpg");
         ElementoGalleria foto2 = new Foto("Vacanza2.jpg");
 
         // Creazione di una cartella di foto
         CartellaFoto cartellaVacanze = new CartellaFoto("Vacanze");
         cartellaVacanze.aggiungiElemento(foto1);
         cartellaVacanze.aggiungiElemento(foto2);
 
         // Creazione di una sottocartella di foto
         CartellaFoto cartellaViaggi = new CartellaFoto("Viaggi");
         cartellaViaggi.aggiungiElemento(cartellaVacanze);
 
         // Mostra la galleria
         cartellaViaggi.mostra();
    }
}
