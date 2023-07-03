//HANDLER
interface GestoreRichiesta {
    void setSuccessore(GestoreRichiesta successore); //RIFERIMENTO AL SUCCESSORE
    void RichiestaPer(String nome); //handle request
}