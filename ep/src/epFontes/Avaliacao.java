package epFontes;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Avaliacao {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	
    private long aluno;
	private Date data;
	private double peso;
	private double altura;
	private int idade;
	private double triciptal_med_1;
	private double triciptal_med_2;
	private double triciptal_med_3;
	private double triciptal_med;
	private double s_iliaca_1;
	private double s_iliaca_2;
	private double s_iliaca_3;
	private double s_iliaca;
	private double fem_media_1;
	private double fem_media_2;
	private double fem_media_3;
	private double fem_media;
	private double perc_gordura;
	private double massa_gorda;
	private double massa_magra;
	private double cir_abdominal;
	private double br;
	private double bc;
	private double cx;
	private double peit;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAluno() {
		return aluno;
	}
	public void setAluno(long aluno) {
		this.aluno = aluno;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getTriciptal_med_1() {
		return triciptal_med_1;
	}
	public void setTriciptal_med_1(double triciptal_med_1) {
		this.triciptal_med_1 = triciptal_med_1;
	}
	public double getTriciptal_med_2() {
		return triciptal_med_2;
	}
	public void setTriciptal_med_2(double triciptal_med_2) {
		this.triciptal_med_2 = triciptal_med_2;
	}
	public double getTriciptal_med_3() {
		return triciptal_med_3;
	}
	public void setTriciptal_med_3(double triciptal_med_3) {
		this.triciptal_med_3 = triciptal_med_3;
	}
	public double getTriciptal_med() {
		return triciptal_med;
	}
	public void setTriciptal_med(double triciptal_med) {
		this.triciptal_med = triciptal_med;
	}
	public double getS_iliaca_1() {
		return s_iliaca_1;
	}
	public void setS_iliaca_1(double s_iliaca_1) {
		this.s_iliaca_1 = s_iliaca_1;
	}
	public double getS_iliaca_2() {
		return s_iliaca_2;
	}
	public void setS_iliaca_2(double s_iliaca_2) {
		this.s_iliaca_2 = s_iliaca_2;
	}
	public double getS_iliaca_3() {
		return s_iliaca_3;
	}
	public void setS_iliaca_3(double s_iliaca_3) {
		this.s_iliaca_3 = s_iliaca_3;
	}
	public double getS_iliaca() {
		return s_iliaca;
	}
	public void setS_iliaca(double s_iliaca) {
		this.s_iliaca = s_iliaca;
	}
	public double getFem_media_1() {
		return fem_media_1;
	}
	public void setFem_media_1(double fem_media_1) {
		this.fem_media_1 = fem_media_1;
	}
	public double getFem_media_2() {
		return fem_media_2;
	}
	public void setFem_media_2(double fem_media_2) {
		this.fem_media_2 = fem_media_2;
	}
	public double getFem_media_3() {
		return fem_media_3;
	}
	public void setFem_media_3(double fem_media_3) {
		this.fem_media_3 = fem_media_3;
	}
	public double getFem_media() {
		return fem_media;
	}
	public void setFem_media(double fem_media) {
		this.fem_media = fem_media;
	}
	public double getPerc_gordura() {
		return perc_gordura;
	}
	public void setPerc_gordura(double perc_gordura) {
		this.perc_gordura = perc_gordura;
	}
	public double getMassa_gorda() {
		return massa_gorda;
	}
	public void setMassa_gorda(double massa_gorda) {
		this.massa_gorda = massa_gorda;
	}
	public double getMassa_magra() {
		return massa_magra;
	}
	public void setMassa_magra(double massa_magra) {
		this.massa_magra = massa_magra;
	}
	public double getCir_abdominal() {
		return cir_abdominal;
	}
	public void setCir_abdominal(double cir_abdominal) {
		this.cir_abdominal = cir_abdominal;
	}
	public double getBr() {
		return br;
	}
	public void setBr(double br) {
		this.br = br;
	}
	public double getBc() {
		return bc;
	}
	public void setBc(double bc) {
		this.bc = bc;
	}
	public double getCx() {
		return cx;
	}
	public void setCx(double cx) {
		this.cx = cx;
	}
	public double getPeit() {
		return peit;
	}
	public void setPeit(double peit) {
		this.peit = peit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(bc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(br);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cir_abdominal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cx);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		temp = Double.doubleToLongBits(fem_media);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fem_media_1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fem_media_2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fem_media_3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + idade;
		temp = Double.doubleToLongBits(massa_gorda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(massa_magra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(perc_gordura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(s_iliaca);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(s_iliaca_1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(s_iliaca_2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(s_iliaca_3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(triciptal_med);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(triciptal_med_1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(triciptal_med_2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(triciptal_med_3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Avaliacao other = (Avaliacao) obj;
		if (Double.doubleToLongBits(altura) != Double
				.doubleToLongBits(other.altura))
			return false;
		if (aluno != other.aluno)
			return false;
		if (Double.doubleToLongBits(bc) != Double.doubleToLongBits(other.bc))
			return false;
		if (Double.doubleToLongBits(br) != Double.doubleToLongBits(other.br))
			return false;
		if (Double.doubleToLongBits(cir_abdominal) != Double
				.doubleToLongBits(other.cir_abdominal))
			return false;
		if (Double.doubleToLongBits(cx) != Double.doubleToLongBits(other.cx))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (Double.doubleToLongBits(fem_media) != Double
				.doubleToLongBits(other.fem_media))
			return false;
		if (Double.doubleToLongBits(fem_media_1) != Double
				.doubleToLongBits(other.fem_media_1))
			return false;
		if (Double.doubleToLongBits(fem_media_2) != Double
				.doubleToLongBits(other.fem_media_2))
			return false;
		if (Double.doubleToLongBits(fem_media_3) != Double
				.doubleToLongBits(other.fem_media_3))
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (Double.doubleToLongBits(massa_gorda) != Double
				.doubleToLongBits(other.massa_gorda))
			return false;
		if (Double.doubleToLongBits(massa_magra) != Double
				.doubleToLongBits(other.massa_magra))
			return false;
		if (Double.doubleToLongBits(peit) != Double
				.doubleToLongBits(other.peit))
			return false;
		if (Double.doubleToLongBits(perc_gordura) != Double
				.doubleToLongBits(other.perc_gordura))
			return false;
		if (Double.doubleToLongBits(peso) != Double
				.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(s_iliaca) != Double
				.doubleToLongBits(other.s_iliaca))
			return false;
		if (Double.doubleToLongBits(s_iliaca_1) != Double
				.doubleToLongBits(other.s_iliaca_1))
			return false;
		if (Double.doubleToLongBits(s_iliaca_2) != Double
				.doubleToLongBits(other.s_iliaca_2))
			return false;
		if (Double.doubleToLongBits(s_iliaca_3) != Double
				.doubleToLongBits(other.s_iliaca_3))
			return false;
		if (Double.doubleToLongBits(triciptal_med) != Double
				.doubleToLongBits(other.triciptal_med))
			return false;
		if (Double.doubleToLongBits(triciptal_med_1) != Double
				.doubleToLongBits(other.triciptal_med_1))
			return false;
		if (Double.doubleToLongBits(triciptal_med_2) != Double
				.doubleToLongBits(other.triciptal_med_2))
			return false;
		if (Double.doubleToLongBits(triciptal_med_3) != Double
				.doubleToLongBits(other.triciptal_med_3))
			return false;
		return true;
	}


}
