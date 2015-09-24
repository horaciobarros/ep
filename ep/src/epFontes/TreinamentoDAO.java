package epFontes;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TreinamentoDAO {
	public List<Treinamento> lista() {
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery(" from Treinamento ");  
		List<Treinamento> lista = select.list();
		
		return lista;
	}
	
	public boolean adiciona(Treinamento a) {

		boolean adicionado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.save(a);
			session.flush();
			session.close();
			adicionado = true;
		} catch (Exception e) {

		}

		return adicionado;
	}

	public boolean exclui(Treinamento a) {

		boolean excluido = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.delete(a);
			session.flush();
			session.close();
			excluido = true;
		} catch (Exception e) {

		}

		return excluido;
	}
	
	public boolean altera(Treinamento a) {

		boolean alterado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.update(a);
			session.flush();
			session.close();
			alterado = true;
			
		} catch (Exception e) {

		}

		return alterado;
	}
	

}
