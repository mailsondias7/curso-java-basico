package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class VerificadorConsoanteVogal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira uma letra min�scula: ");
		char letra = scan.next().charAt(0);

		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("A letra inserida: " + letra + ", � uma Vogal");
			break;
		default:
			System.out.println("A letra inserida: " + letra + ", � uma Consoante");
		}

	}

}
