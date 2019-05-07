package decorator;

public abstract class Decorator implements Forma {
	
	public Forma f;
	
	public Decorator(Forma f) {
		this.f = f;
	}
	
	public void desenhar() {
		f.desenhar();
	}
	
}
