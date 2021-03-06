package epFontes;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ExercicioCardiovascularDAO {
	public boolean existe(ExercicioCardiovascular e) {
		Session session = HibernateUtil.getSession();
		return false;
	}

	public boolean adiciona(ExercicioCardiovascular e) {

		boolean adicionado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.save(e);
			session.flush();
			session.close();
			adicionado = true;
		} catch (Exception e2) {

		}

		return adicionado;
	}

	public boolean exclui(ExercicioCardiovascular e) {

		boolean excluido = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.delete(e);
			session.flush();
			session.close();
			excluido = true;
		} catch (Exception e2) {

		}

		return excluido;
	}
	
	public boolean altera(ExercicioCardiovascular e) {

		boolean alterado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.update(e);
			session.flush();
			session.close();
			alterado = true;
			
		} catch (Exception ee) {

		}

		return alterado;
	}
	public List<ExercicioCardiovascular> getLista() {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from ExercicioCardiovascular");  
		select.setMaxResults(200);
		List<ExercicioCardiovascular> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		
		return objetos;
		
	}

}
