package dados;

import javax.persistence.EntityManagerFactory;

import basica.TipoUsuario;

public class DAOTipoUsuario extends DAOGenerico<TipoUsuario> implements IDAOTipoUsuario {

	public DAOTipoUsuario(EntityManagerFactory emf) {
		super(emf);
	}

}
