public class Client {
    public static void main(String[] args) {

        //1) si crea un istanza di Concretemediator
        Mediator mediator = new ConcreteMediator();
        
        //2)vengono creati i ConcreteColleague e gli si passa un mediator e un nome
        Colleague colleague1 = new ConcreteColleague(mediator, "Colleague 1");
        Colleague colleague2 = new ConcreteColleague(mediator, "Colleague 2");
        Colleague colleague3 = new ConcreteColleague(mediator, "Colleague 3");
        
        //3) i ConcreteColleague vengono registrati nel Mediator
        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);
        
        //4)invio dei messaggi tra colleghi
        colleague1.sendMessage("Hello everyone!");  //collega1 invia un messaggio
        colleague3.sendMessage("Hi there!");       //collega3 invia un messaggio
    }
}
