class GestoreMario implements GestoreRichiesta {
    private GestoreRichiesta successore;

   @Override
    public void setSuccessore(GestoreRichiesta successore) {
        this.successore = successore;
    }

    @Override
    public void RichiestaPer(String nome) {
        if (nome.equalsIgnoreCase("Mario")) {
            System.out.println("Ciao, sono Mario! Come posso aiutarti?");
        } else if (successore != null) {
            successore.RichiestaPer(nome);
        } else {
            System.out.println("Mi dispiace, non posso gestire la tua richiesta.");
        }
    }
}