package epFontes;


public class AvaliacaoRN {

	public boolean salvar(Avaliacao a) {
		AvaliacaoDAO dao = new AvaliacaoDAO();
		if (a.getId() == 0)
			dao.adiciona(a);
		else
			dao.altera(a);
		return true;
	}

}
