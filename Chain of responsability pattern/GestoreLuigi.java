class GestoreLuigi implements GestoreRichiesta {
    private GestoreRichiesta successore;

    @Override
    public void setSuccessore(GestoreRichiesta successore) { //settre il successore
        this.successore = successore;
    }

    @Override
    public void RichiestaPer(String nome) {
        if (nome.equalsIgnoreCase("Luigi")) { //se il nome corrisponde gestisce 
            System.out.println("Salve, Luigi! Posso essere d'aiuto?");
        } else if (successore != null) { //altrimenti passa la richiesta al successore
            successore.RichiestaPer(nome);
        } else {                         // se non c'è nessun gestore a disposizione
            System.out.println("Mi spiace, nessun gestore disponibile per la tua richiesta.");
        }
    }
}
   
