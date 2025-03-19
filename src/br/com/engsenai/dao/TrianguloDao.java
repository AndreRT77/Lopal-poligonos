package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Triangulo;

public class TrianguloDao {

	public static void criartriangulo() {
		Triangulo triangulo = new Triangulo();
		Scanner leitor = new Scanner(System.in);

		System.out.println();
		System.out.println("Criando um objeto de triângulo...");
		System.out.println("Qual é a base do triângulo? ");		
		//Criar um objeto scanner
		triangulo.setBase(leitor.nextDouble());
		
		
		System.out.println("Qual é a altura do triângulo? ");	
		triangulo.setAltura(leitor.nextDouble());

		
		
		triangulo.mostrarResultados();
		
		leitor.close();
		
	}
	
}

