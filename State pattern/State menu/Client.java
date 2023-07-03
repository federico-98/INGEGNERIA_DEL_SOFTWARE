public class Client
{
	public static void main(String[] args) {
		LobbyMenu simpleBot = new LobbyMenu();
		
		simpleBot.communicate();
		simpleBot.setPhrase(2);
		System.out.print("\n");
		simpleBot.communicate();
     
	}
}