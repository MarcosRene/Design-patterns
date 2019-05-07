package observer;

public class BinarioObserver extends Observer {

	private ConverteTipos tipo;

	public BinarioObserver(ConverteTipos tipo) {
		this.tipo = tipo;
		this.tipo.anexar(this);
	}

	@Override
	public void update() {
		System.out.println("Binário: " + Integer.toBinaryString(tipo.getEstado()));
	}

}
