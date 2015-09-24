package epFontes;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GrupoMuscularDAO {

	public List<GrupoMuscular> getLista() {

		Session sessao = HibernateUtil.getSession();
		Transaction tx = sessao.beginTransaction();
		Query select = sessao.createQuery("from GrupoMuscular");
		select.setMaxResults(500);
		List<GrupoMuscular> objetos = select.list();
		tx.commit();
		sessao.close();

		return objetos;

	}

}
