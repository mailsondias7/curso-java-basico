package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class VerificadorDeSexo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu sexo: M ou F");
		char sexo = scan.next().charAt(0) ;
		
		switch(sexo){
		case 'M': System.out.println("Sexo Informado: M - Masculino"); break;
		case 'F': System.out.println("Sexo Informado: F - Feminino");break;
		default: System.out.println("Sexo Inválido!");
		}
		
	}

}
