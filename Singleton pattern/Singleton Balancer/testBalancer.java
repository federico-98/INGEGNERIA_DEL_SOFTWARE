public class testBalancer{

	public static void main(String[] args) {
		Balancer b = Balancer.getInstance();
		for (int i = 0; i < 10; i++) {
			System.out.println("Call: " + b.getHost());
		}
	}
	
}