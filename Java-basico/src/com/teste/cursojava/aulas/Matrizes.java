package com.teste.cursojava.aulas;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 6;
		notasAlunos[0][2] = 7.5;
		notasAlunos[0][3] = 9;

		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 7.2;
		notasAlunos[1][3] = 10;

		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 10;
		notasAlunos[2][2] = 6;
		notasAlunos[2][3] = 6.5;

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}

	}
}
