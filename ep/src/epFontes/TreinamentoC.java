package epFontes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TreinamentoC implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private long treinamento;
	private long exerciciocardiovascular;
	private String carga;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTreinamento() {
		return treinamento;
	}
	public void setTreinamento(long treinamento) {
		this.treinamento = treinamento;
	}
	public long getExerciciocardiovascular() {
		return exerciciocardiovascular;
	}
	public void setExerciciocardiovascular(long exerciciocardiovascular) {
		this.exerciciocardiovascular = exerciciocardiovascular;
	}
	public String getCarga() {
		return carga;
	}
	public void setCarga(String carga) {
		this.carga = carga;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga == null) ? 0 : carga.hashCode());
		result = prime * result
				+ (int) (exerciciocardiovascular ^ (exerciciocardiovascular >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (treinamento ^ (treinamento >>> 32));
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
		TreinamentoC other = (TreinamentoC) obj;
		if (carga == null) {
			if (other.carga != null)
				return false;
		} else if (!carga.equals(other.carga))
			return false;
		if (exerciciocardiovascular != other.exerciciocardiovascular)
			return false;
		if (id != other.id)
			return false;
		if (treinamento != other.treinamento)
			return false;
		return true;
	}
	
	
	
}
	


