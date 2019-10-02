import java.util.Scanner;

public class Aula07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		
		while (x != 0) {
			x = teclado.nextInt();
			
		}
		
		teclado.close();
	}

}
