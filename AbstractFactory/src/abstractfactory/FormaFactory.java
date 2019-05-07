package abstractfactory;

public class FormaFactory extends AbstractFactory {
	@Override
	public Forma getForma(String tipo) {
		if (tipo.equals("Retangulo")) {
			return new Retangulo();
		} else if (tipo.equals("Quadrado")) {
			return new Quadrado();
		}
		return null;
	}
}
