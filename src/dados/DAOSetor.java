package dados;

import javax.persistence.EntityManagerFactory;

import basica.Setor;

public class DAOSetor extends DAOGenerico<Setor> implements IDAOSetor {

	public DAOSetor(EntityManagerFactory emf) {
		super(emf);
	}
}