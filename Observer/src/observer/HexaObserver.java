package observer;

public class HexaObserver extends Observer {

	private ConverteTipos tipo;
	
	public HexaObserver(ConverteTipos tipo) {
		this.tipo = tipo;
		this.tipo.anexar(this);
	}

	@Override
	public void update() {
		System.out.println("Hex: " + Integer.toHexString(tipo.getEstado()).toUpperCase());
	}
}
