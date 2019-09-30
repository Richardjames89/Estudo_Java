import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		double altura;
		
		
		System.out.println("Digite seu nome: ");
		nome = teclado.next();	
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Digite sua altura: ");
		altura = teclado.nextDouble();
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		
		

	}

}
