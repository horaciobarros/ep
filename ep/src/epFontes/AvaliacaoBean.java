package epFontes;

import java.util.List;
import javax.faces.bean.*;

@RequestScoped
@ManagedBean(name = "avaliacaoBean")
public class AvaliacaoBean {
	private List<Avaliacao> lista;
	private Avaliacao avaliacao = new Avaliacao();
	private String msg;
    private List<Aluno> alunos;
    private Aluno aluno;
    
    public AvaliacaoBean() {
    	AlunoDAO dao = new AlunoDAO();
    	this.alunos = dao.getLista();
    }
    
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String salvar() {
		AvaliacaoRN rn = new AvaliacaoRN();
		rn.salvar(this.avaliacao);
		return "avaliacao";
	}
	public String editar() {
		return ("avaliacao.xhtml");
		
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void changeAlunos(List<Aluno> alunos) {
		
	}
	
}
