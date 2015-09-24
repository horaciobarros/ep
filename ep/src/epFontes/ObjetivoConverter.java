package epFontes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.*;

import epFontes.Aluno;

@FacesConverter(forClass = Objetivo.class)
public class ObjetivoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		// TODO Auto-generated method stub
		if (value != null && value.trim().length() > 0) {
			try {
				long id = Long.valueOf(value);
				try {

					ObjetivoRN objetivoRN = new ObjetivoRN();
					return objetivoRN.buscaObjetivoPeloId(id);
				} catch (Exception e) {
					throw new ConverterException(
							"Não foi possível encontrar o aluno de codigo "
									+ value + ". " + e.getMessage());

				}
			} catch (Exception e) {

			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		// TODO Auto-generated method stub
		if (value != null) {
			Objetivo objetivo = (Objetivo) value;
			return Long.toString(objetivo.getId());
		}

		return null;
	}

}
