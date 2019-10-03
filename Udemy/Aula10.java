import java.util.Locale;
import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
				
		int n = teclado.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0;i<n;i++) {
			nomes[i] = teclado.next();
			idades[i] = teclado.nextInt();
			alturas[i] = teclado.nextDouble();
		}
					
		double soma = 0.0;
		for(int i=0;i<n;i++){
			soma = soma + alturas[i];
		}
		double media = soma/n;
		System.out.printf("Altura media: %.2f%n", media);
		
		int cont = 0;
		for (int i=0;i<n;i++) {
			if(idades[i]<16) {
				cont = cont + 1;
			}
		}
		double x = cont * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f %%%n", x);
		
		teclado.close();
	}

}
