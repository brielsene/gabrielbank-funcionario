
public class SistemaInterno extends Funcionario {
	
	private int senha ;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void autentica (Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Login com sucesso");
		}else {
			System.out.println("Não");
		}
		
		
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
