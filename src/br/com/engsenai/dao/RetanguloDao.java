package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Retangulo;

public class RetanguloDao {

 public static void criarRetangulo() {
	    Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner(System.in);

		System.out.println();
		System.out.println("Criando um objeto do Retângulo...");
		System.out.println("Qual é a base do retângulo? ");		
		//Criar um objeto scanner
		retangulo.setBase(leitor.nextDouble());

		System.out.println("Qual é a altura do retângulo? ");	
		retangulo.setAltura(leitor.nextDouble());

		
		
		retangulo.mostrarResultados();
		
		leitor.close();
		
	}
	
}


