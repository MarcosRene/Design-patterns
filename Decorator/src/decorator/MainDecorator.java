package decorator;

public class MainDecorator {

	public static void main(String[] args) {
		
		Forma corCirculo = new AdicionarCor(new Circulo());
		System.out.println("Circulo colorido");
		corCirculo.desenhar();
		
		
		Forma corRetangulo = new AdicionarCor(new Retangulo());
		System.out.println("Retangulo colorido");
		corRetangulo.desenhar();
		
		
	}
	
}
