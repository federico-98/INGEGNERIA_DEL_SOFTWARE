public class Client {
    public static void main(String[] args) {
		Console console = new Console();
		Observer obv = new ConsoleSubscriber();
		console.addObserver(obv);
		
		console.showMessage();
		
		console.changeMessage("this is the changed message.");
		
		console.showMessage();
	}
}
