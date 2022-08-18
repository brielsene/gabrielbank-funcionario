
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario ();
		f1.setSalario(1000);
		
		System.out.println("SUa bonificação é de:" +f1.getBonificacao());
		System.out.println("E seu salário é de: " +f1.getSalario());

	}

}
