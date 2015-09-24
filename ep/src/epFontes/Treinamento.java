package epFontes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Treinamento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "aluno")
    private Aluno aluno;
	
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "objetivo")
	private Objetivo objetivo;
	
	private String obs;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Objetivo getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		
		result = prime * result + ((obs == null) ? 0 : obs.hashCode());
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
		Treinamento other = (Treinamento) obj;
		if (aluno != other.aluno)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id != other.id)
			return false;
		if (objetivo != other.objetivo)
			return false;
		if (obs == null) {
			if (other.obs != null)
				return false;
		} else if (!obs.equals(other.obs))
			return false;
		return true;
	}
	
	
	
	
	

}
