package negocio;

import basica.TipoUsuario;
import dados.DAOFactory;
import dados.DAOTipoUsuario;
import util.NegocioException;

public class RNTipoUsuario {
	
	private DAOFactory daoFactory;

	public RNTipoUsuario() {
		daoFactory = new DAOFactory();
	}
	
	public void verificaPreenchimento(TipoUsuario s) throws NegocioException {
		if (s == null) {
			throw new NegocioException("Objeto não preenchido!");
		}
	}
	
	public void inserirTipoUsuario(TipoUsuario e) throws NegocioException{
		try{
			this.verificaPreenchimento(e);
			DAOTipoUsuario daoTipoUsuario = daoFactory.getDAOTipoUsuario();
			daoTipoUsuario.insert(e);
		}catch(Exception ex){
			throw new NegocioException(ex.getMessage());
		}
	}
	

}