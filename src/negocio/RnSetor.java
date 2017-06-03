package negocio;

import java.util.List;

import basica.Setor;
import dados.DaoSetor;

public class RnSetor {
	
	public void inserirSetor(Setor s) throws Exception{
		try{
			this.verificaPreenchimento(s);
			DaoSetor ds = new DaoSetor();
			ds.inserir(s);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}
	
	public void removeSetor(Setor s) throws Exception{
		try{
			this.verificaPreenchimento(s);
			DaoSetor ds = new DaoSetor();
			ds.remover(s);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public void alterarSetor(Setor s) throws Exception{
		try{
			this.verificaPreenchimento(s);
			DaoSetor ds = new DaoSetor();
			ds.atualizar(s);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public List<Setor> listaSetor() throws Exception{
		 List<Setor> s = null;
		try{
			
			DaoSetor ds = new DaoSetor();
			s =  ds.listar();
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		return s;
	}
	
	private void verificaPreenchimento(Setor s) throws Exception{
		if(s == null){
			throw new Exception("Nenhum setor existente!");
		}else if(s.getNumeroIdentificador().isEmpty()){
			throw new Exception("Numero identificador vasio!");
		}
	}
}
