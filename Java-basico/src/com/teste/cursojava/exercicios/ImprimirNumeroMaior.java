package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class ImprimirNumeroMaior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Imprimir Número Maior");
		
		System.out.println("insira o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("insira o segundo número: ");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O primeiro número inserido: " + num1 + " é o maior");
		}else {
			System.out.println("O segundo numéro inserido: " + num2 + " é o maior");
		}

	}

}
