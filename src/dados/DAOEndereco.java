package dados;

import javax.persistence.EntityManagerFactory;

import basica.Endereco;

public class DAOEndereco extends DAOGenerico<Endereco> implements IDAOEndereco {

	public DAOEndereco(EntityManagerFactory emf) {
		super(emf);
	}

}
