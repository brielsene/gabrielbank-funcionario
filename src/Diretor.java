
public class Diretor extends Funcionario {
	private  int segundofator;
	
	public int getSegundofator() {
		return segundofator;
	}
	
	public void setSegundofator(int segundofator) {
		this.segundofator = segundofator;
	}
	
	public double getBonificacao() {
		return super.getSalario()+ super.getBonificacao()+1000;
	}

}
