//PROTOTYPE
abstract class Veicolo{ 
    
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello){
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public abstract Veicolo clone(); //abstract= costringe le sottoclassi ad implementarlo
                         

}