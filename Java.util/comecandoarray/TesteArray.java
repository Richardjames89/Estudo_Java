package comecandoarray;

import java.util.ArrayList;

public class TesteArray {

	public static void main(String[] args) {
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		Contato c1 = new Contato("Richard", "richard@gmail.com", "021111111111");
		Contato c2 = new Contato("James", "james@gmail.com", "0212222222222");
		Contato c3 = new Contato("Cavalcante", "cavalcante@gmail.com", "0213333333333");
		Contato c4 = new Contato("Guimarães", "guimaraes@gmail.com", "0214444444444");
		Contato c5 = new Contato("Ferreira", "ferreira@gmail.com", "0215555555555");

		contatos.add(c1);
		contatos.add(c2);
		contatos.add(c3);
		contatos.add(c4);
		contatos.add(c5);
		
		
		for(Contato c : contatos) {
			System.out.println(c.toString());
		}
		
		System.out.println("Quantidade de itens na lista: " + contatos.size());
		System.out.println("Tem alguém na posição? " + contatos.contains(c2));
		contatos.remove(c2);
		System.out.println("Tem alguém na posição? " + contatos.contains(c2));
	}

}
