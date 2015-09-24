package epFontes;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AvaliacaoDAO {
	public boolean existe(Avaliacao a) {
		return false;
	}

	public boolean adiciona(Avaliacao a) {

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

	public boolean exclui(Avaliacao a) {

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
	
	public boolean altera(Avaliacao a) {

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
	public List<Avaliacao> getLista(Aluno aluno) {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from Avaliacao where aluno="+aluno.getId());  
		select.setMaxResults(500);
		List<Avaliacao> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		return objetos;
		
	}

}
