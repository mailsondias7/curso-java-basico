package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class MediaNotasAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("=CALCULAR MEDIA=");
		System.out.println("Insira a primeira nota: ");
		float primeiraNota = scan.nextFloat();
		System.out.println("Insira a segunda nota: ");
		float segundaNota = scan.nextFloat();

		float media = (primeiraNota + segundaNota) / 2;

		if (media == 10) {
			System.out.println("Aluno Aprovado com distin��o");
		} else if (media >= 7) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado10");
		}
	}

}
