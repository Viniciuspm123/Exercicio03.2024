package tarefa03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número total de eleitores que irão votar :");
		int eleitores = sc.nextInt();
		System.out.println("Digite o número de eleitores que votaram em branco : ");
		int votosBrancos = sc.nextInt();
		System.out.println("Digite o número de eleitores que votaram nulo : ");
		int votosNulos = sc.nextInt();
		System.out.println("Digite o número de eleitores que votaram em algum candidato : ");
		int votosValidos = sc.nextInt();

		double porcentagem1 = (votosBrancos / (double) eleitores) * 100;
		double porcentagem2 = (votosNulos / (double) eleitores) * 100;
		double porcentagem3 = (votosValidos / (double) eleitores) * 100;

		System.out.println("A quantidade porcentual de votos brancos é de : " + porcentagem1 + "%");
		System.out.println("A quantidade porcentual de votos nulos é de : " + porcentagem2 + "%");
		System.out.println("A quantidade porcentual de votos validos é de : " + porcentagem3 + "%");

		sc.close();
	}

}
