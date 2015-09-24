package epFontes;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class TipoMembroDAO {
	
public List<TipoMembro> getLista() {
		
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery("from TipoMembro");  
		select.setMaxResults(500);
		List<TipoMembro> objetos = select.list();  
		tx.commit();  
		sessao.close(); 
		
		return objetos;
		
	}

}
