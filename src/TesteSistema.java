import java.util.Scanner;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(11);
		
		
		
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);

	}

}
