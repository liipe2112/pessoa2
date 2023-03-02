package pessoa2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		Pessoa pessoa = new Pessoa(nome, idade, altura);
		
		System.out.println("Seu nome é: " + pessoa.getNome());
		System.out.println("Sua idade é: " + pessoa.getIdade());
		System.out.println("Sua altura é: " + pessoa.getAltura());
	}
}
