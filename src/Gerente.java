
public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	private AutenticacaoUtil autenticador;
	
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
				
		
	}
	
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
		
	}
	
	
	public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario()+(super.getSalario()*0.10);
	}

	




}
