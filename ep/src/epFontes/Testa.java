package epFontes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testa {
	public static void main (String args[]) {
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> usuarios = dao.lista(); 
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getLogin());
			
		}
		
		
	}
}
