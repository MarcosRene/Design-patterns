package facade;

public class Facade {

	private Forma circulo;
	private Forma quadrado;
	private Forma retangulo;

	public Facade() {
		circulo = new Circulo();
		quadrado = new Quadrado();
		retangulo = new Retangulo();
	}

	public void desenharCirculo() {
		circulo.desenhar();
	}

	public void desenharQuadrado() {
		quadrado.desenhar();
	}

	public void desenharRetangulo() {
		retangulo.desenhar();
	}

}
