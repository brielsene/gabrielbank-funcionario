
public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	
	
	public boolean autentica (int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario()+(super.getSalario()*0.10);
	}

	




}
