package br.com.engsenai;

import br.com.engsenai.model.Quadrado;
import br.com.engsenai.model.Retangulo;

public class Main{

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.mostrarResultados();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setBase(5);
		retangulo.setAltura(10);
		retangulo.mostrarResultados();
	}
		
	}
