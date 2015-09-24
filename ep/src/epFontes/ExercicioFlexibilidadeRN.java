package epFontes;

public class ExercicioFlexibilidadeRN {

	public boolean salvar(ExercicioFlexibilidade e) {
		ExercicioFlexibilidadeDAO dao = new ExercicioFlexibilidadeDAO();
		if (e.getId() == 0)
			dao.adiciona(e);
		else
			dao.altera(e);
		return true;
	}

}
