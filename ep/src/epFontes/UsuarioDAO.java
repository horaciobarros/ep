package epFontes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDAO {

	public boolean existe(Usuario usuario) {
		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from Usuario u where u.login = :pLogin and u.senha = :pSenha");
		query.setParameter("pLogin", usuario.getLogin());
		query.setParameter("pSenha", usuario.getSenha());
		List lista = query.list();

		boolean encontrado = !lista.isEmpty();

		return encontrado;
	}

	public boolean adiciona(Usuario usuario) {

		boolean adicionado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.save(usuario);
			session.flush();
			session.close();
			adicionado = true;
		} catch (Exception e) {

		}

		return adicionado;
	}

	public boolean exclui(Usuario usuario) {

		boolean excluido = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.delete(usuario);
			session.flush();
			session.close();
			excluido = true;
		} catch (Exception e) {

		}

		return excluido;
	}
	
	public boolean altera(Usuario usuario) {

		boolean alterado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.update(usuario);
			session.flush();
			session.close();
			alterado = true;
			
		} catch (Exception e) {

		}

		return alterado;
	}
	public List lista() {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from Usuario");  
		List<Usuario> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		return objetos;
		
	}
}