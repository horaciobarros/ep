package epFontes;
import java.io.ByteArrayInputStream;
import java.util.List;
import javax.faces.bean.*;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@SessionScoped
@ManagedBean(name = "treinamentoBean")
public class TreinamentoBean {
	
	private Treinamento t = new Treinamento();
	private String msg;
	private List<Treinamento> lista;
    private List<Aluno> alunos;
    private List<Objetivo> objetivos;
    private List<ExercicioCardiovascular> ecards;
    private List<ExercicioFlexibilidade> eflexs;
    private List<ExercicioMusculacao> emuscs;
    private List<TreinamentoM> treinamentom;
    private List<TreinamentoF> treinamentof;
    private List<TreinamentoC> treinamentoc;
    private Aluno aluno;
    private Objetivo objetivo;
    
	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	private StreamedContent imagem;
    
    public Aluno getAluno() {
    	
    	//System.out.println("3" + aluno.getNome());
		return aluno;
	}

	public StreamedContent getImagem() {
		try {
			imagem = new DefaultStreamedContent(new ByteArrayInputStream(aluno.getFoto()));
		} catch (Exception e) {
			//System.out.println("Erro buscando a imagem:" + e);
			
		}
		return imagem;
	}

	public void setAluno(Aluno aluno) {
		//System.out.println("5" + aluno.getNome());
	
		this.aluno = aluno;
	}

	public TreinamentoBean() {
    	AlunoDAO dao = new AlunoDAO();
    	this.alunos = dao.getLista();
    }
    
	public Treinamento getT() {
		return t;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String salvar() {
		TreinamentoRN rn = new TreinamentoRN();
		this.t.setAluno(aluno);
		this.t.setObjetivo(objetivo);
		rn.salvar(this.t);
	    this.setAluno(new Aluno());
	    this.setObjetivo(new Objetivo());
	    this.setT(new Treinamento());
		
		return "fichatreino";
	}
	public String editar() {
		return ("fichatreino.xhtml");
		
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void changeAlunos(List<Aluno> alunos) {
		
	}
	
	public void setT(Treinamento t) {
		this.t = t;
	}
	
	public List<Treinamento> getLista() {
		return lista;
	}

	public void setLista(List<Treinamento> lista) {
		this.lista = lista;
	}

	public List<Objetivo> getObjetivos() {
		ObjetivoDAO dao = new ObjetivoDAO();
    	this.objetivos = dao.getLista();
    
		return objetivos;
	}

	public void setObjetivos(List<Objetivo> objetivos) {
		this.objetivos = objetivos;
	}

	public List<ExercicioCardiovascular> getEcards() {
		return ecards;
	}

	public void setEcards(List<ExercicioCardiovascular> ecards) {
		this.ecards = ecards;
	}

	public List<ExercicioFlexibilidade> getEflexs() {
		return eflexs;
	}

	public void setEflexs(List<ExercicioFlexibilidade> eflexs) {
		this.eflexs = eflexs;
	}

	public List<ExercicioMusculacao> getEmuscs() {
		return emuscs;
	}

	public void setEmuscs(List<ExercicioMusculacao> emuscs) {
		this.emuscs = emuscs;
	}

	public List<TreinamentoM> getTreinamentom() {
		return treinamentom;
	}

	public void setTreinamentom(List<TreinamentoM> treinamentom) {
		this.treinamentom = treinamentom;
	}

	public List<TreinamentoF> getTreinamentof() {
		return treinamentof;
	}

	public void setTreinamentof(List<TreinamentoF> treinamentof) {
		this.treinamentof = treinamentof;
	}

	public List<TreinamentoC> getTreinamentoc() {
		return treinamentoc;
	}

	public void setTreinamentoc(List<TreinamentoC> treinamentoc) {
		this.treinamentoc = treinamentoc;
	}
	
	public String changeAluno() { 
		
		
		return "fichatreino";
		
	}
	
}
