package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class VerificarNumPositivoOuNegativo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Verificar de N�mero Positivo ou Negativo");

		System.out.println("Insira um numero: ");
		int numero = scan.nextInt();

		if (numero > 0) {
			System.out.println("N�mero inserido: " + numero + ", � positivo");
		} else {
			System.out.println("N�mero inserido: " + numero + ", � negativo");
		}
	}

}
