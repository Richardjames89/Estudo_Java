import java.util.Scanner;

public class Aula11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int m = teclado.nextInt();
		int n = teclado.nextInt();
		
		int [][] mat = new int [m][n];
		
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				mat [i][j] = teclado.nextInt();			
				}
		}
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");			
				}	
				System.out.println();		
		}
		
		teclado.close();

	}

}
