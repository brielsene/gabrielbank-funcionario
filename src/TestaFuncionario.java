import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario ();
		f1.setSalario(1000);
		Scanner scan = new Scanner(System.in);
		
		
		//Cadastro de um funcionário.
		System.out.println("aperta 1 para cadastrar");
		int i = 0;
		i = scan.nextInt();
		
		if(i == 1) {
			System.out.println("Digite o nome:");
			f1.setNome(scan.next());
			System.out.println("Digite o cpf");
			f1.setCpf(scan.next());
			System.out.println("Digite seu data de nascimento");
			f1.setDt_nascimento(scan.next());
			System.out.println("Digite o salário do funcionário");
			f1.setSalario(scan.nextDouble());
			
			System.out.println("Funcionário cadastrado com sucesso: \n"
					+"Nome: "+ f1.getNome()+"\n" +"CPF: "+f1.getCpf()+" \n"
					+ " Data de nascimento: "+f1.getDt_nascimento()+" \n"+
					" E o salário é de: "+f1.getSalario() +" \n"
					+ " E a bonificação é de:" +f1.getBonificacao()
					
					);
			
			
		}
		
		
	}

}
