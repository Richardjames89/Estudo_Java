
public class ModificadoresString {

	public static void main(String[] args) {
		String nome = "Richard";
		
		String vazio = "    Richard     ";
		String ov = vazio.trim();
		System.out.println(ov.isEmpty());
		System.out.println(vazio.isEmpty());
		System.out.println(vazio);
		System.out.println(ov);
		
		
		char e = nome.charAt(2);
		
		int pos = nome.indexOf("ha");
		
		String sub = nome.substring(2);
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		char c = 'R';
		char d = 'r';
		
		String outra = nome.replace(c,d);
		
		System.out.println(nome.length());
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(pos);
		System.out.println(sub);

	}

}
