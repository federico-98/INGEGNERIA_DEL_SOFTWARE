//CONCRETE OBSERVERS
public class ConsoleSubscriber implements Observer {
    public void update(){
        System.out.print("\nA new message has been inserted into the console!\n");
    }
}
