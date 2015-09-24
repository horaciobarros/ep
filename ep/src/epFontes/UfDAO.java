package epFontes;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UfDAO {
	public List<Uf> lista() {
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery(" from Uf");  
		List<Uf> lista = select.list();
	
		
		return lista;
		
	}

}
