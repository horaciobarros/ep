package epFontes;

public class TreinamentoRN {
	public boolean salvar(Treinamento t) {
		TreinamentoDAO dao = new TreinamentoDAO();
		if (t.getId() == 0)
			dao.adiciona(t);
		else
			dao.altera(t);
		return true;
	}

}
