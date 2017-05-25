package dados_old;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {
	
	private static final EntityManagerFactory factory;
	
	static{
		factory = Persistence.createEntityManagerFactory("goToChurchUnit");
	}

}