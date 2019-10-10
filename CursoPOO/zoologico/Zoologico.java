
public class Zoologico {

	public static void main(String[] args) {
		Canguru c = new Canguru();
		
		c.setIdade(10);
		c.setCorPelo("Marrom");
		c.setMembros(4);
		c.setPeso(100.5);
		
		System.out.println("Canguru com: " + c.getIdade()+" anos!");
		System.out.println("Tem cor: " + c.getCorPelo());
		System.out.println("Possui: " + c.getMembros() + " membros");
		System.out.println("Tem o peso de: " + c.getPeso() + "Kg");
		
		c.aliementar();
		c.emitirSom();
		c.locomover();
		c.usarBolsa();
		

	}

}
