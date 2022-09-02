
public class Diretor extends Funcionario implements Autenticavel {
	private  int segundofator;
	
	private int senha;
	
	public int getSegundofator() {
		return segundofator;
	}
	
	public void setSegundofator(int segundofator) {
		this.segundofator = segundofator;
	}
	
	public double getBonificacao() {
		return super.getSalario()+ (super.getSalario()*0.25);
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}

}
