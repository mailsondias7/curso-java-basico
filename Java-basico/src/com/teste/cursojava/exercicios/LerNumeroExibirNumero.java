package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class LerNumeroExibirNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int numero = scan.nextInt();
		
		System.out.println("O número inserido foi: " + numero);
	}

}
