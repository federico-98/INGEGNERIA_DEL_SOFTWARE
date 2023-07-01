// ADAPTER
class ItalianGreetingsTransaltor extends Russian implements Translator{

    /*!!! Questa volta nella funzione translate non dobbiamo più creare un oggetto di tipo Russian 
    poiché ereditiamo automaticamente tutte le funzioni necessarie
    */
    public String translate(String str){ 
        if(str == "ciao" || str == "Ciao"){   //привет Добро Пожаловать пользыватель
            return this.GetString();
        }else if(str == "Benvenuto utente" ){
            this.SetString("Добро Пожаловать пользыватель");
            return this.GetString();
        }else{
            return str = "ERROR la stringa non è stata scritta in modo giusto";
        }
    }
}