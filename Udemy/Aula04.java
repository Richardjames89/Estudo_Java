import java.util.Scanner;

public class Aula04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
				
		double comp;
		double larg;
		double pmq;
		
		double area;
		double pre;
				
		
		System.out.println("Digite a Largura: ");
		larg = teclado.nextDouble();
		System.out.println("Digite o Comprimento: ");
		comp = teclado.nextDouble();
		System.out.println("Digite o Pre�o do Metro Quadrado");
		pmq = teclado.nextDouble();
		
		
		area = larg*comp;
		pre = area*pmq;
		
		System.out.println("O Tamanho da �rea � de: " + area);
		System.out.println("O Pre�o � de R$: "+ pre);

	}

}
