package exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(" Digite seu nome:");
		String sexo = JOptionPane.showInputDialog("Sexo Digite M ou F:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if (sexo.equals("F") && idade < 25  ) {
			
			System.out.println(nome + " Aceita");
			
		
		} else
			System.out.println(nome + " Não aceita");

	}

}
