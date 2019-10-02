import java.util.Scanner;

public class Aula06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		int x;
		String dia;
		System.out.println("Digite o número correspondente ao dia da semana: ");
		x = teclado.nextInt();
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:	
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		teclado.close();
			}

}
