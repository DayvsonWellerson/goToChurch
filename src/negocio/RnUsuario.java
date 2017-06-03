package negocio;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;

import basica.Usuario;
import dados.DaoUsuario;

public class RnUsuario {
	
	public void inserirUsuario(Usuario u) throws Exception{
		try{
			this.verificaPreenchimento(u);
			DaoUsuario du = new DaoUsuario();
			du.inserir(u);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}
	
	public void removeUsuario(Usuario u) throws Exception{
		try{
			this.verificaPreenchimento(u);
			DaoUsuario du = new DaoUsuario();
			du.remover(u);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public void alterarUsuario(Usuario u) throws Exception{
		try{
			this.verificaPreenchimento(u);
			DaoUsuario du = new DaoUsuario();
			du.atualizar(u);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public List<Usuario> listaUsuario() throws Exception{
		 List<Usuario> u = null;
		try{
			
			DaoUsuario du = new DaoUsuario();
			u =  du.listar();
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		return u;
	}
	
	private void verificaPreenchimento(Usuario u) throws Exception{
		if(u == null){
			throw new Exception("Nenhum usuário existente!");
		}else if(u.getNome().isEmpty()){
			throw new Exception("Nome vasio!");
		}else if(u.getEmail().isEmpty()){
			throw new Exception("Email vasio!");
		}
	}

}
