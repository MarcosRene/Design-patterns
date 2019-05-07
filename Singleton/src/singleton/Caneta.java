package singleton;

public class Caneta {

	private static Caneta instance = new Caneta();
	
	private Caneta() {}
	
	public static Caneta getInstante() {
		return instance;
	}
	
	public void escrever() {
		System.out.println("Escrevendo...");
	}
	
}
