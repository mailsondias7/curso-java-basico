package com.teste.cursojava.exercicios;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];

		Random numRandom = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numRandom.nextInt();
			}
		}

		int maior = 0;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + coluna);
	}

}
