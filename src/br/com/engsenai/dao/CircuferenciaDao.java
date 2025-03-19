package br.com.engsenai.dao;

import java.util.Scanner;


import br.com.engsenai.model.Circuferencia;

public class CircuferenciaDao {

	public static void criarCircuferencia() {
		Circuferencia circuferencia = new Circuferencia();
		
		System.out.println();
		System.out.println("Criando um objeto de circuferencia...");
		System.out.println("Qual o raio da circuferência? ");		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		circuferencia.setRaio(leitor.nextDouble());
		
		
		
		circuferencia.mostrarResultados();
		
		leitor.close();
		
	}
	
}
