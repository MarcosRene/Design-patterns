package mvc;

public class MainMVC {
	
	
	private static EstudanteModel cadastrarEstudante(){
	     EstudanteModel estudante = new EstudanteModel();
	     estudante.setMat("391228");
	     estudante.setNome("Marcos Renê");
	     return estudante;
	}
	
	public static void main(String[] args) {
		
		EstudanteModel estudanteModel = cadastrarEstudante();
		EstudanteView estudanteView = new EstudanteView();
		
		EstudanteController estudanteController = new EstudanteController(estudanteModel, estudanteView);
		
		estudanteController.updateView();
		
	}
	
	
}
