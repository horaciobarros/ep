package epFontes;

public class ExercicioCardiovascularRN {

	public boolean salvar(ExercicioCardiovascular e) {
		ExercicioCardiovascularDAO dao = new ExercicioCardiovascularDAO();
		if (e.getId() == 0)
			dao.adiciona(e);
		else
			dao.altera(e);
		return true;
	}


}
