package epFontes;


import java.util.List;
import javax.faces.bean.*;

@RequestScoped
@ManagedBean(name = "exercicioMusculacaoBean")
public class ExercicioMusculacaoBean {
	private List<ExercicioMusculacao> lista;
	private ExercicioMusculacao em = new ExercicioMusculacao();
	private String msg;
	private String nomePesquisa = "";
    private List<GrupoMuscular> grupo;
	
	public ExercicioMusculacaoBean() { 
		GrupoMuscularDAO dao = new GrupoMuscularDAO();
    	this.grupo = dao.getLista();
	}

	public ExercicioMusculacao getEm() {
		return em;
	}
	
	public void setEm(ExercicioMusculacao em) {
		this.em = em;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String salvar() {
		ExercicioMusculacaoRN rn = new ExercicioMusculacaoRN();
		rn.salvar(this.em);
		return "pesquisaem";
	}
	
	public String editar() {
		return "em";
		
	}

	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public void setEf(ExercicioMusculacao em) {
		this.em = em;
	}
	
	public List<ExercicioMusculacao> getLista() {
		ExercicioMusculacaoDAO dao = new ExercicioMusculacaoDAO();
		return dao.getLista();
	}

	public List<GrupoMuscular> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<GrupoMuscular> grupo) {
		this.grupo = grupo;
	}

	public void setLista(List<ExercicioMusculacao> lista) {
		
		
		this.lista = lista;
	}
    public void changeGrupos(List<GrupoMuscular> grupos) {
		
	}


}
