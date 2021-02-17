package com.teste.cursojava.exercicios;

import java.util.Random;

public class Matrizes2 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];

		Random numAleatorios = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numAleatorios.nextInt(100); // Gera 100 numeros Aleatorios
			}
		}

		// Exibir numeros da Matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;
		int linha5 = 5;
		for (int i = 0; i < matriz[5].length; i++) {
			if (matriz[linha5][i] > maiorLinha5) {
				maiorLinha5 = matriz[linha5][i];
			}
			if (matriz[linha5][i] < menorLinha5) {
				menorLinha5 = matriz[linha5][i];
			}
		}

		// Impressao de Valores
		System.out.println("Maior valor da linha 5 = " + maiorLinha5);
		System.out.println("Menor valor da linha 5 = " + menorLinha5);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numAleatorios.nextInt(100); // Gera 100 numeros Aleatorios
			}
		}
		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;
		int coluna7 = 7;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][coluna7] > maiorC7) {
				maiorC7 = matriz[i][coluna7];
			}
			if (matriz[i][coluna7] < menorC7) {
				menorC7 = matriz[i][coluna7];
			}

		}

		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("Menor valor da coluna 7 = " + menorC7);

	}

}