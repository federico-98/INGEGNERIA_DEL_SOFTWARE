class Foto implements ElementoGalleria {
    private String nome;

    public Foto(String nome) {
        this.nome = nome;
    }

    public void mostra() {
        System.out.println("Mostra foto: " + nome);
    }
}