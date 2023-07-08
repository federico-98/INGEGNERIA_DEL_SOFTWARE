class ConcreteColleague implements Colleague {
    private Mediator mediator; //riferimento al Mediator per inviare messaggi
    private String name;       //nome del ConcreteColleague

    public ConcreteColleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void receiveMessage(String message) {   //per ricevere un messaggio
        System.out.println(name + " received the message: " + message);
    }

    public void sendMessage(String message) {   //per inviare un messaggio
        mediator.sendMessage(message, this);    //così il Mediator si occupa dell'invio 
    }

}
