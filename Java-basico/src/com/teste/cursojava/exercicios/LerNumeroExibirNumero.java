package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class LerNumeroExibirNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		int numero = scan.nextInt();
		
		System.out.println("O n�mero inserido foi: " + numero);
	}

}
