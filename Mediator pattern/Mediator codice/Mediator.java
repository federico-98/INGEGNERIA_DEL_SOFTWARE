interface Mediator {
    
    //metodo per inviare un messaggio da un ConcreteColleague al Mediator
    void sendMessage (String message, Colleague colleague); 

    //metodo per aggiungere un Colleague al Mediator
    void addColleague(Colleague colleague);
}