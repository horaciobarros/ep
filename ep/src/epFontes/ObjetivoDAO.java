package epFontes;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ObjetivoDAO {
	public boolean existe(Objetivo o) {
		Session session = HibernateUtil.getSession();
		return false;
	}

	public boolean adiciona(Objetivo o) {

		boolean adicionado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.save(o);
			session.flush();
			session.close();
			adicionado = true;
		} catch (Exception e) {

		}

		return adicionado;
	}

	public boolean exclui(Objetivo o) {

		boolean excluido = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.delete(o);
			session.flush();
			session.close();
			excluido = true;
		} catch (Exception e) {

		}

		return excluido;
	}
	
	public boolean altera(Objetivo o) {

		boolean alterado = false;

		Session session = HibernateUtil.getSession();

		try {
			session.beginTransaction();
			session.update(o);
			session.flush();
			session.close();
			alterado = true;
			
		} catch (Exception e) {

		}

		return alterado;
	}
	public List<Objetivo> getLista() {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from Objetivo");  
		select.setMaxResults(200);
		List<Objetivo> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		return objetos;
		
	}
	
	public Objetivo buscaObjetivoPeloId(long id) {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from Objetivo where id = " + id);  
		List<Objetivo> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		return objetos.get(0);
		
	}


}
