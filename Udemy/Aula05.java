import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		int hora;
		
		System.out.println("Digite a hora para saber se: Bom dia, Boa tarde ou Boa noite");
		hora = teclado.nextInt();
		
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else {
			if(hora < 18) {
				System.out.println("Boa tarde!");
			} else {
				System.out.println("Boa noite!");
			}
		}
		
		teclado.close();
	}

}
