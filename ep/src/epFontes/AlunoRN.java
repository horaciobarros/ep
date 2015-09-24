package epFontes;

public class AlunoRN {

	public boolean salvar(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO();
		if (aluno.getId() == 0)
			dao.adiciona(aluno);
		else
			dao.altera(aluno);
		return true;
	}
	
	public Aluno buscaAlunoPeloId(long id) {
		AlunoDAO dao = new AlunoDAO();
		return dao.buscaAlunoPeloId(id);
	}

}
