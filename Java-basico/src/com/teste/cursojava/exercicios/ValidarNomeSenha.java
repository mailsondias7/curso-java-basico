package com.teste.cursojava.exercicios;

import java.util.Scanner;

public class ValidarNomeSenha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean senhaValida = false;
		String nomeUsuario;
		String senha;

		do {
			System.out.println("Insira seu nome: ");
			nomeUsuario = scan.next();

			System.out.println("Insira a senha: ");
			senha = scan.next();

			if (nomeUsuario.equalsIgnoreCase(senha)) {
				//senhaValida = false;
				System.out.println("A senha não pode ser igual ao nome");
			} else {
				senhaValida = true;
				System.out.println("Senha e Usúario válidos");
			}
		} while (!senhaValida);

	}

}
