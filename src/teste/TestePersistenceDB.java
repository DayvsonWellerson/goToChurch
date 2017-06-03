package teste;

import basica.Usuario;
import dados.DaoFactory;
import dados.DaoUsuario;

public class TestePersistenceDB {
	
	
	
	
	public static void main(String[] args){
		
		DaoUsuario du = DaoFactory.getDaoUsuario();
		Usuario u = new Usuario();
		u.setNome("Dayvson");
		u.setCpf("123.123.123-00");
		u.setEmail("nomail@nomail.com");
		u.setSexo('M');
		
		du.inserir(u);
	}

}
