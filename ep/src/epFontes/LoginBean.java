
package epFontes;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "loginBean")
public class LoginBean {
	private Usuario usuario = new Usuario();
	private String msg;

	public Usuario getUsuario() {
		return usuario;
	}

	public String efetuaLogin() {
		UsuarioDAO dao = new UsuarioDAO();
		boolean loginValido = dao.existe(usuario);
		if (loginValido) {
			msg = "";
			return "menujs";
		} else {
			usuario = new Usuario();
			msg = "Dados incorretos!";
			return "login";
		}

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}