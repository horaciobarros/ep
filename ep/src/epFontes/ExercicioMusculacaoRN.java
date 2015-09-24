package epFontes;


public class ExercicioMusculacaoRN {

	public boolean salvar(ExercicioMusculacao e) {
		ExercicioMusculacaoDAO dao = new ExercicioMusculacaoDAO();
		if (e.getId() == 0)
			dao.adiciona(e);
		else
			dao.altera(e);
		return true;
	}

}