package dados;

import javax.persistence.EntityManagerFactory;

import basica.Congregacao;

public class DAOCongregacao extends DAOGenerico<Congregacao> implements IDAOCongregacao {

	public DAOCongregacao(EntityManagerFactory emf) {
		super(emf);
	}

}
