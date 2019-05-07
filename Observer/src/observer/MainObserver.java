package observer;

public class MainObserver {
	public static void main(String[] args) {
		ConverteTipos tipo = new ConverteTipos();

		new HexaObserver(tipo);
		new OctalObserver(tipo);
		new BinarioObserver(tipo);

		System.out.println("Converter: 15");
		tipo.setEstado(15);
		System.out.println("Converter: 10");
		tipo.setEstado(10);
	}
}
