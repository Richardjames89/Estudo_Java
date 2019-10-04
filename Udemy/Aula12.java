import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int m = teclado.nextInt();
		int n = teclado.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = teclado.nextInt();
			}
		}
		System.out.println("Valores Negativos: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]<0) {
					System.out.println(mat [i][j]);
				}
			}
		}
		
		
		teclado.close();
		
	}

}
