package dados;

import javax.persistence.EntityManagerFactory;

import basica.Usuario;

public class DAOUsuario extends DAOGenerico<Usuario> implements IDAOUsuario {

	public DAOUsuario(EntityManagerFactory emf) {
		super(emf);
	}

}
