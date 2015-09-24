package epFontes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.*;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@SessionScoped
@ManagedBean(name = "alunoBean")
public class AlunoBean {
	private List<Aluno> lista;
	private Aluno aluno = new Aluno();
	private String msg;
	private String nomePesquisa = "";
	private StreamedContent imagem;

	public AlunoBean() {
		

	}

	public Aluno getAluno() {
		return aluno;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String salvar() {
		AlunoRN rn = new AlunoRN();
		rn.salvar(this.aluno);
		return "pesquisaaluno";
	}

	public String editar() {
		return ("aluno.xhtml");

	}
	
	public String incluir() {
		setAluno(null);
		return ("aluno.xhtml");

	}


	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
		try {
			imagem = new DefaultStreamedContent(new ByteArrayInputStream(aluno.getFoto()));
		} catch (Exception e) {
			
		}
	}

	public List<Aluno> getLista() {
		AlunoDAO dao = new AlunoDAO();
		if (nomePesquisa.equals("")) {
			return dao.getLista();
		} else {
			return dao.getListaPorNome(nomePesquisa);
		}
	}

	public String pesquisar() {
		AlunoDAO dao = new AlunoDAO();
		this.lista = dao.getListaPorNome(nomePesquisa);
		return "pesquisaaluno";

	}

	public StreamedContent getImagem() {
		return imagem;
	}

	public void setImagem(StreamedContent imagem) {
		this.imagem = imagem;
	}

	public String handleFileUpload(FileUploadEvent event) {
		try {
			this.imagem = new DefaultStreamedContent(event.getFile()
					.getInputstream());
			byte[] foto = event.getFile().getContents();
			this.aluno.setFoto(foto);
			return ("aluno.xhtml");
		} catch (Exception ex) {
			System.out.println(ex);
			//Logger.getLogger(AlunoBean.class.getName()).log(Level.SEVERE, null, ex);
			return ("aluno.xhtml");
		}
	}

}