package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class ImprimirNumeroMaior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Imprimir N�mero Maior");
		
		System.out.println("insira o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("insira o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O primeiro n�mero inserido: " + num1 + " � o maior");
		}else {
			System.out.println("O segundo num�ro inserido: " + num2 + " � o maior");
		}

	}

}
