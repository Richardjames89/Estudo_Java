package br.com.richard;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {


		Set<String> alunos = new HashSet<String>();
		alunos.add("Richard");
		alunos.add("James");
		alunos.add("Cavalcante");
		alunos.add("Guimarães");
		alunos.add("Ferreira");
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos);

	}

}
