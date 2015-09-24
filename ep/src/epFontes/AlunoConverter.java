package epFontes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.*;
import epFontes.Aluno;

@FacesConverter(forClass = Aluno.class)
public class AlunoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if (value != null && value.trim().length() > 0) {
			long id = Long.valueOf(value);
			try {
				AlunoRN alunoRN = new AlunoRN();
				return alunoRN.buscaAlunoPeloId(id);
			} catch (Exception e) {
				throw new ConverterException("Não foi possível encontrar o aluno de codigo " + 
						value + ". " + e.getMessage());
				
			}
		}
		return null;
	}
		
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		if (value != null) {
			Aluno aluno = (Aluno) value;
			return Long.toString(aluno.getId());
		}
		
		return null;
	}
	
	
	

}
