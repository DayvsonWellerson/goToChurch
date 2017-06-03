package negocio;

import java.util.List;

import basica.Congregacao;
import dados.DaoCongregacao;

public class RnCongregacao {
	
	public void inserirCongregacao(Congregacao c) throws Exception{
		try{
			this.verificaPreenchimento(c);
			DaoCongregacao dc = new DaoCongregacao();
			dc.inserir(c);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}
	
	public void removeCongregacao(Congregacao c) throws Exception{
		try{
			this.verificaPreenchimento(c);
			DaoCongregacao dc = new DaoCongregacao();
			dc.remover(c);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public void alterarCongregacao(Congregacao c) throws Exception{
		try{
			this.verificaPreenchimento(c);
			DaoCongregacao dc = new DaoCongregacao();
			dc.atualizar(c);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public List<Congregacao> listaCongregacao() throws Exception{
		 List<Congregacao> c = null;
		try{
			
			DaoCongregacao dc = new DaoCongregacao();
			c =  dc.listar();
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		return c;
	}
	
	private void verificaPreenchimento(Congregacao c) throws Exception{
		if(c == null){
			throw new Exception("Nenhuma congregação existente!");
		}else if(c.getNome().isEmpty()){
			throw new Exception("Nome vasio!");
		}else if(c.getCoordenador().isEmpty()){
			throw new Exception("Coordenador vasio!");
		}
	}

}
