package com.teste.cursojava.aula02;

import java.util.Scanner;

public class LerDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Ol�, " + nomeCompleto + ". \nSeja bem-vindo!");

		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade + " anos");
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: " + altura);
		
	}

}
