import java.util.ArrayList;
import java.util.List;

class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void sendMessage(String message, Colleague sender) { //(messaggio, mandante)
        for (Colleague colleague : colleagues) {
            if (colleague != sender) { //a tutti i Collegue, manda un messaggio tranne al mittente
                colleague.receiveMessage(message);
            }
        }
    }

}
