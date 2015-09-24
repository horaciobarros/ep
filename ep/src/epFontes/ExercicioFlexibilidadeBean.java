package epFontes;


import java.util.List;
import javax.faces.bean.*;

@RequestScoped
@ManagedBean(name = "exercicioFlexibilidadeBean")
public class ExercicioFlexibilidadeBean {
	private List<ExercicioFlexibilidade> lista;
	private ExercicioFlexibilidade ef = new ExercicioFlexibilidade();
	private String msg;
	private String nomePesquisa = "";
    private List<TipoMembro> tipos;
	
	public ExercicioFlexibilidadeBean() { 
		TipoMembroDAO dao = new TipoMembroDAO();
    	this.tipos = dao.getLista();
	}

	public ExercicioFlexibilidade getEf() {
		return ef;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String salvar() {
		ExercicioFlexibilidadeRN rn = new ExercicioFlexibilidadeRN();
		rn.salvar(this.ef);
		return "pesquisaef";
	}
	
	public String editar() {
		return "ef";
		
	}

	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public void setEf(ExercicioFlexibilidade ef) {
		this.ef = ef;
	}
	
	public List<ExercicioFlexibilidade> getLista() {
		ExercicioFlexibilidadeDAO dao = new ExercicioFlexibilidadeDAO();
		return dao.getLista();
	}

	public List<TipoMembro> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoMembro> tipos) {
		this.tipos = tipos;
	}

	public void setLista(List<ExercicioFlexibilidade> lista) {
		
		
		this.lista = lista;
	}
    public void changeTipos(List<TipoMembro> tipos) {
		
	}


}
