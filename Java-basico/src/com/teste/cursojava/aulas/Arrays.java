package com.teste.cursojava.aulas;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 30.2;
		temperaturas[2] = 29;
		temperaturas[3] = 35;
		temperaturas[4] = 27.5;
		temperaturas[5] = 32;

		System.out.println("Valor da temperatura do dia 1: " + temperaturas[0]);

		System.out.println("Tamanho do Array: " + temperaturas.length);

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura no dia " + (i+1) + " �: " + temperaturas[i]);
		}
	}

}
