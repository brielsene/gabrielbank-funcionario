import java.util.Scanner;

public class TesteSistema {

	public static void main(String[] args) {
		Autenticavel g = new Gerente();
		
		
		SistemaInterno si = new SistemaInterno();
		g.setSenha(11);
		si.autentica(g);
		
		Cliente c = new Cliente();
		c.setSenha(0);
		si.autentica(c);
	
		
		
		
	

	}

}
