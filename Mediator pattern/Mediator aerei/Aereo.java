class Aereo implements AeroMobile {
    private CentraleControllo mediatore;
    private String nome;

    public Aereo(CentraleControllo mediatore, String nome) {
        this.mediatore = mediatore;
        this.nome = nome;
    }

    @Override
    public void inviaMessaggio(String messaggio) {
        System.out.println(nome + " invia il messaggio: " + messaggio);
        mediatore.inviaMessaggio(messaggio, this);
    }

    @Override
    public void riceviMessaggio(String messaggio) {
        System.out.println(nome + " riceve il messaggio: " + messaggio);
    }


}