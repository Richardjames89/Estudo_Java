
public class Empresa {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("James");
		g1.setCpf("999.888.777.66");
		g1.setSalario(8000.0);
		g1.setSenha(12345);
		boolean autenticou = g1.autentica(12345);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());		
		System.out.println(g1.getBonificacao());	
		System.out.println(autenticou);
		
		
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Richard");
		f1.setCpf("111.222.333.44");
		f1.setSalario(5000.0);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());		
		System.out.println(f1.getBonificacao());

	}

}
