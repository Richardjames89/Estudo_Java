package br.com.richard;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java","Richard James");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
		javaColecoes.adiciona(new Aula("Criando Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 15));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34567);
		Aluno a2 = new Aluno("Guilherme Silveira", 65687);
		Aluno a3 = new Aluno("Mauricio Aniche", 12587);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno ->{System.out.println(aluno);});
		
		
		System.out.println("O aluno"+a1+", está matriculado? \n"+javaColecoes.estaMatriculado(a1));
		
		
	}

}
