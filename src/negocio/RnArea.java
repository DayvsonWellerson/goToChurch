package negocio;

import java.util.List;

import basica.Area;
import dados.DaoArea;

public class RnArea {
	
	public void inserirUsuario(Area a) throws Exception{
		try{
			this.verificaPreenchimento(a);
			DaoArea da = new DaoArea();
			da.inserir(a);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}
	
	public void removeUsuario(Area a) throws Exception{
		try{
			this.verificaPreenchimento(a);
			DaoArea da = new DaoArea();
			da.remover(a);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public void alterarUsuario(Area a) throws Exception{
		try{
			this.verificaPreenchimento(a);
			DaoArea da = new DaoArea();
			da.atualizar(a);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public List<Area> listaUsuario() throws Exception{
		 List<Area> a = null;
		try{
			
			DaoArea da = new DaoArea();
			a =  da.listar();
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		return a;
	}
	
	private void verificaPreenchimento(Area a) throws Exception{
		if(a == null){
			throw new Exception("Nenhuma área existente!");
		}else if(a.getNumeroIdentificador().isEmpty()){
			throw new Exception("Nome vasio!");
		}
	}
}
