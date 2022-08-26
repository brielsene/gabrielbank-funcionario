
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("Gabriel dono do Bradesco");
		g.setSalario(15000);
		

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		
		Faxineiro f = new Faxineiro();
		f.setSalario(1500);
		
		controle.registra(f);

		System.out.println(controle.getSoma());
		
		
		System.out.println(controle.getSoma());
		

	}

}
