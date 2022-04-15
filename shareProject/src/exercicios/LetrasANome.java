package exercicios;

import java.util.Scanner;

public class LetrasANome {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println(" Digite seu nome ");
		String nome = in.nextLine();
		System.out.println(qtda(nome));
	}

	public static int qtda(String nome) {

		int qtda = 0;

		for (int i = 0; i < nome.length(); i++) {

			if (nome.charAt(i) == 'a'|| nome.charAt(i) == 'A') {
				qtda++;
			}
		}

		return qtda;
	}
}
