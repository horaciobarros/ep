package epFontes;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlunoDAO {
	public boolean existe(Aluno a) {
		Session session = HibernateUtil.getSession();
		return false;
	}

	public boolean adiciona(Aluno a) {

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

	public boolean exclui(Aluno a) {

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
	
	public boolean altera(Aluno a) {

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
	public List<Aluno> getLista() {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from Aluno");  
		select.setMaxResults(200);
		List<Aluno> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		return objetos;
		
	}
	public List<Aluno> getListaPorNome(String nome) {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from Aluno where nome like '%"+nome+"%'" );  
		select.setMaxResults(200);
		List<Aluno> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		
		return objetos;
		
	}
	
	public Aluno buscaAlunoPeloId(long id) {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from Aluno where id = "+id );  
		List<Aluno> objetos = select.list();  
		tx.commit();  
		sessao.close();
		return objetos.get(0);
		
	}

}
