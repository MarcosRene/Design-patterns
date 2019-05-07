package observer;

public class OctalObserver extends Observer {

	private ConverteTipos tipo;

	public OctalObserver(ConverteTipos tipo){
	      this.tipo = tipo;
	      this.tipo.anexar(this);
	   }

	@Override
	public void update() {
		System.out.println("Octal: " + Integer.toOctalString(tipo.getEstado()));
	}
}