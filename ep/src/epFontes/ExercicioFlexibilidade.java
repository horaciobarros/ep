package epFontes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExercicioFlexibilidade implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private long tipomembro;
	private String descricao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getTipomembro() {
		return tipomembro;
	}
	public void setTipomembro(long tipomembro) {
		this.tipomembro = tipomembro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (tipomembro ^ (tipomembro >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExercicioFlexibilidade other = (ExercicioFlexibilidade) obj;
		if (tipomembro != other.tipomembro)
			return false;
		return true;
	}

}
