package tarefa03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Data de Nascimento!!");
		System.out.println();
		System.out.println("Informe seu ano de nascimento : ");
		int ano = sc.nextInt();
		System.out.println("Informe seu mês de nascimento (Apenas números) : ");
		int mes = sc.nextInt();
		System.out.println("Informe o dia em que você nasceu : ");
		int dia = sc.nextInt();
		
		int anoDeNascimento = ((2024-ano)*365-365);
		int mesDeNascimento = (12-mes)*30;
		int resultado = (anoDeNascimento+mesDeNascimento+dia);
		
		
		System.out.println("Você tem "+resultado+" dias de vida");
		sc.close();
	}

}
