package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===SOMA===");
		
		System.out.println("Insira um n�mero: ");
		float num1 = scan.nextFloat();
	
		System.out.println("Insira o segundo n�mero: ");
		float num2 = scan.nextFloat();
		
		float resultado = num1 + num2;
		
		System.out.println("A soma dos n�meros �: " + resultado);
	}

}
