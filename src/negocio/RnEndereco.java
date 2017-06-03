package negocio;

import java.util.List;

import basica.Endereco;
import dados.DaoEndereco;

public class RnEndereco {
	public void inserirEndereco(Endereco e) throws Exception{
		try{
			this.verificaPreenchimento(e);
			DaoEndereco de = new DaoEndereco();
			de.inserir(e);
		}catch(Exception ex){
			throw new Exception(ex.getMessage());
		}
		
	}
	
	public void removeEndereco(Endereco e) throws Exception{
		try{
			this.verificaPreenchimento(e);
			DaoEndereco de = new DaoEndereco();
			de.remover(e);
		}catch(Exception ex){
			throw new Exception(ex.getMessage());
		}
	}
	
	public void alterarEndereco(Endereco e) throws Exception{
		try{
			this.verificaPreenchimento(e);
			DaoEndereco de = new DaoEndereco();
			de.atualizar(e);
		}catch(Exception ex){
			throw new Exception(ex.getMessage());
		}
	}
	
	public List<Endereco> listaEndereco() throws Exception{
		 List<Endereco> e = null;
		try{
			
			DaoEndereco de = new DaoEndereco();
			e =  de.listar();
		}catch(Exception ex){
			throw new Exception(ex.getMessage());
		}
		return e;
	}
	
	private void verificaPreenchimento(Endereco e) throws Exception{
		if(e == null){
			throw new Exception("Nenhum usuário existente!");
		}else if(e.getCidade().isEmpty()){
			throw new Exception("Cidade vasia!");
		}else if(e.getBairro().isEmpty()){
			throw new Exception("Bairro vasio!");
		}else if(e.getLogradouro().isEmpty()){
			throw new Exception("Logradouro vasio!");
		}else if(e.getNumero().isEmpty()){
			throw new Exception("Número vasio!");
		}
	}
}
