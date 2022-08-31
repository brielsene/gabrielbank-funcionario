
public class SistemaInterno extends Funcionario {
	
	private int senha = 11;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void autentica (FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Login com sucesso");
		}else {
			System.out.println("Não");
		}
		
		
	}
	
	
	
	

}
