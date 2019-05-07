package decorator;

public class AdicionarCor extends Decorator {

	public AdicionarCor(Forma f) {
		super(f);
	}

	@Override
	public void desenhar() {
		f.desenhar();
		setColor(f);
	}

	private void setColor(Forma f) {
		System.out.println("Azul");
	}

}
