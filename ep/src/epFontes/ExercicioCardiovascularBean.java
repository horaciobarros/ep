package epFontes;


import java.util.List;
import javax.faces.bean.*;

@RequestScoped
@ManagedBean(name = "exercicioCardiovascularBean")
public class ExercicioCardiovascularBean {
	
	private List<ExercicioCardiovascular> lista;
	private ExercicioCardiovascular ec = new ExercicioCardiovascular();
	private String msg;
	private String nomePesquisa = "";
	
	public ExercicioCardiovascularBean() { 
				
	}

	public ExercicioCardiovascular getEc() {
		return ec;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String salvar() {
		ExercicioCardiovascularRN rn = new ExercicioCardiovascularRN();
		rn.salvar(this.ec);
		return "pesquisaec";
	}
	
	public String editar() {
		return "ec";
		
	}

	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public void setEc(ExercicioCardiovascular ec) {
		this.ec = ec;
	}
	
	public List<ExercicioCardiovascular> getLista() {
		ExercicioCardiovascularDAO dao = new ExercicioCardiovascularDAO();
		return dao.getLista();
	}
}
