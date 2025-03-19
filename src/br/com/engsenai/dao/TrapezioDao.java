package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Trapezio;

public class TrapezioDao {


	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		Scanner leitor = new Scanner(System.in);

		System.out.println();
		System.out.println("Criando um objeto de triângulo...");
		System.out.println("Qual é a base MAIOR do trapézio? ");	
		trapezio.setBaseMaior(leitor.nextDouble());
		System.out.println("Qual é a base MENOR do trapézio? ");	
		trapezio.setBaseMenor(leitor.nextDouble());
		System.out.println("Informe altura ");
		trapezio.setAltura(leitor.nextDouble());
		

		
		
		trapezio.mostrarResultados();
		
		leitor.close();
		
	}
	
}

