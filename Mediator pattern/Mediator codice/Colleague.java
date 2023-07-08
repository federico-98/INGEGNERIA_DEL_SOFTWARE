interface Colleague {
    //metodo chiamato da Mediator per consegnare messaggi al Colleague
    public void receiveMessage(String message);

    //metodo chiamato dal Colleague per inviare messaggio tramite Mediator
    public void sendMessage(String message);
}