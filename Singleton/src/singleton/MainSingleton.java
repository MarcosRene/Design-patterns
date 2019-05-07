package singleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		Caneta c = Caneta.getInstante();
		
		c.escrever();
		
	}
	
}
