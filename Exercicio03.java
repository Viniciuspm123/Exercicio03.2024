package tarefa03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor bruto do seu salário : ");
	double salario = sc.nextDouble();
	
	System.out.println("Informe o porcentual de reajuste (sem %)");
	double reajuste = sc.nextDouble();
	
	double valorFinal = salario *(reajuste/100);
	
	double salarioAtual = salario + valorFinal;
	
	System.out.println("O novo salário com reajuste : "+salarioAtual);
	sc.close();
	}

}
