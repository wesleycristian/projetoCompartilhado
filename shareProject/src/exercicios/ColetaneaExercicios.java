package exercicios;

import java.util.Scanner;

public class ColetaneaExercicios {

	public static void main(String[] args) {

		System.out.println(quatroDigitosDoNome("Paola"));
		letrasNaPosicaoImpar("Wesley");
		letrasNaPosicaoPar("Isac");
		loopdenomeWhile("GUSTAVO", 2);
		loopdenomeFor("Daiana", 3);
		System.out.println(qtdLetrasNaPalavra("Itaquaquecetuba"));
		System.out.println(vogaisNaFrase("Era uma vez"));
		printWordLoopMatriz("Paz", 8);
		inverteString("AnaVitoria");

	}

	public static String quatroDigitosDoNome(String nome) {

		return nome.substring(0, 4);
	}

	public static void letrasNaPosicaoImpar(String palavra) {

		for (int i = 0; i < palavra.length(); i++) {

			if (i % 2 == 0) {
				System.out.print(palavra.charAt(i));
			}
		}

	}

	public static void letrasNaPosicaoPar(String palavra) {

		System.out.println();

		for (int i = 0; i < palavra.length(); i++) {

			if (i % 2 != 0) {
				System.out.print(palavra.charAt(i));
			}

		}

	}

	public static void loopdenomeWhile(String nome, int repetir) {
		System.out.println();
		int i = 0;
		while (i < repetir) {
			System.out.println(nome);
			i++;
		}
	}

	public static void loopdenomeFor(String nome, int repetir) {
		for (int i = 0; i < repetir; i++) {
			System.out.println(nome);
		}

	}

	public static int qtdLetrasNaPalavra(String palavra) {
		return palavra.length();
	}

	public static int vogaisNaFrase(String frase) {
		int qtddVogais = 0;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.toUpperCase().charAt(i) == 'A' || frase.toUpperCase().charAt(i) == 'E'
					|| frase.toUpperCase().charAt(i) == 'I' || frase.toUpperCase().charAt(i) == 'O'
					|| frase.toUpperCase().charAt(i) == 'U') {
				qtddVogais += 1;
			}
		}
		return qtddVogais;
	}

	public static void printWordLoopMatriz(String word, int size) {
		String words[][] = new String[size][size];
		for (int linha = 0; linha < size; linha++) {
			for (int coluna = 0; coluna < size; coluna++) {
				if (linha >= coluna) {
					words[linha][coluna] = word;
					System.out.print(words[linha][coluna]);
				}
			}
			System.out.println();
		}
	}

	public static void inverteString(String word) {
		StringBuilder palavra = new StringBuilder();
		palavra.append(word);
		System.out.println(palavra.reverse());
	}
}
