package epFontes;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CidadeDAO {
	public List<Cidade> lista() {
		Session sessao = HibernateUtil.getSession();  
		Transaction tx = sessao.beginTransaction();  
		Query select = sessao.createQuery(" from Cidade where uf = 'AX' ");  
		List<Cidade> lista = select.list();
		
		return lista;
	}

}
