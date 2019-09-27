import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] vetor = new int[3] ;
		int num;
		for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = in.nextInt();
        }
		
		System.out.println("Digite um valor para procurar no vetor");
        num = in.nextInt();
        
        boolean validacao = validaExistenciaVetor(vetor, num);
		
        
		//Verificar se 7 pertence ao arrayNum
        if (validacao) {
        	System.out.println("O Número pertence ao vetor!");
        }else {
        	System.out.println("O Número NÃO pertence ao vetor!");
        }

	}

	public static boolean validaExistenciaVetor(int[] vetor, int num) {
		for(int i=0; i<vetor.length;i++) {	
			//Pergunta se 12 pertence ao vetor
			if(vetor[i] == num){
				//System.out.println("O Número pertence ao vetor!");
				//break;
				return true;
            // Se não existir...
            }
		}
		
		return false;
		
	}
	

}
