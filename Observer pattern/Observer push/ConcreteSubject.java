public class ConcreteSubject extends Subject {
        public String stato;

        public String getState(){
            return stato;
        }

        public void setStato(String nuovoStato){
            stato = nuovoStato;
            notify(stato);
        }
}
