package abstractfactory;

public class MainAbstractFactory {
	public static void main(String[] args) {
		
		AbstractFactory abFactory1 = FactoryProduce.getForma(true);
		
		Forma forma1 = abFactory1.getForma("Retangulo");
		forma1.desenhar();
		
		Forma forma2 = abFactory1.getForma("Quadrado");
		forma2.desenhar();
	
	}
}
