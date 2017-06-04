package testeUnitario;

import org.junit.Test;

import basica.TipoUsuario;
import util.NegocioException;

public class TesteUnitarioTipoUsuario {
	
	@Test(expected=NegocioException.class)
	public void testeObjeto() throws NegocioException{

		TipoUsuario tu = new TipoUsuario();
		tu.setId(1);
		tu.setTipo("test");
		String tipo = tu.getTipo().toString();
		Integer id = tu.getId();
		
	}
	
	

}
