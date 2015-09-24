package epFontes;

public class ObjetivoRN {

	public boolean salvar(Objetivo objetivo) {
		ObjetivoDAO dao = new ObjetivoDAO();
		if (objetivo.getId() == 0)
			dao.adiciona(objetivo);
		else
			dao.altera(objetivo);
		return true;
	}

	public Object buscaObjetivoPeloId(long id) {
		// TODO Auto-generated method stub
		ObjetivoDAO dao = new ObjetivoDAO();
	    return dao.buscaObjetivoPeloId(id);
	}

}
