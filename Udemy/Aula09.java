import java.util.Locale;
import java.util.Scanner;

public class Aula09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		double[] vet = new double[n];
		
		for(int i=0;i<n;i++) {
			vet[i] = teclado.nextDouble();
		}
		for (int i=0;i<n;i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		
		teclado.close();

	}

}
