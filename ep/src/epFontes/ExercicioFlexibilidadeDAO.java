package epFontes;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class ExercicioFlexibilidadeDAO {
	

	public boolean adiciona(ExercicioFlexibilidade e) {

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

	public boolean exclui(ExercicioFlexibilidade e) {

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
	
	public boolean altera(ExercicioFlexibilidade e) {

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
	public List<ExercicioFlexibilidade> getLista() {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from ExercicioFlexibilidade");  
		select.setMaxResults(200);
		List<ExercicioFlexibilidade> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		
		return objetos;
		
	}


}
