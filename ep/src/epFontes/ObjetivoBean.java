package epFontes;

import java.util.List;
import javax.faces.bean.*;

@RequestScoped
@ManagedBean(name = "objetivoBean")
public class ObjetivoBean {
	
	private List<Objetivo> lista;
	private Objetivo objetivo = new Objetivo();
	private String msg;
	private String nomePesquisa = "";
	
	public ObjetivoBean() { 
				
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String salvar() {
		ObjetivoRN rn = new ObjetivoRN();
		rn.salvar(this.objetivo);
		return "pesquisaobjetivo";
	}
	
	public String editar() {
		return "objetivo2";
		
	}

	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public void setObjetivo(Objetivo o) {
		this.objetivo = o;
	}
	
	public List<Objetivo> getLista() {
		ObjetivoDAO dao = new ObjetivoDAO();
		return dao.getLista();
	}

}
