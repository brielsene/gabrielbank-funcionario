
public class Gerente extends Funcionario {
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

}
