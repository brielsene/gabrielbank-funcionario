
public class Gerente extends FuncionarioAutenticavel {
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getSalario() + super.getBonificacao();
	}
	
	public boolean autentica (String senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}
