package mvc;

public class EstudanteController {

	private EstudanteModel model;
	private EstudanteView view;

	public EstudanteController(EstudanteModel model, EstudanteView view) {
		this.model = model;
		this.view = view;
	}

	public void SetEstudanteMat(String mat) {
		model.setMat(mat);
	}

	public String getEstudanteMat() {
		return model.getMat();
	}
	
	public void setEstudanteNome(String nome) {
		model.setNome(nome);
	}

	public String getEstudanteNome() {
		return model.getNome();
	}

	public void updateView() {
		view.exibir(model.getMat(), model.getNome());
	}

}
