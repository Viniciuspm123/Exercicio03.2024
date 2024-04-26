package tarefa03;

import java.util.Scanner;

public class Exercicio09 {   

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe o valor da prestação: ");
    double valor = sc.nextDouble();
    
    System.out.print("Informe a taxa de juros (em %): ");
    double taxa = sc.nextDouble();
    
    System.out.print("Informe o tempo de atraso (em meses): ");
    double tempo = sc.nextDouble();
    
    double prestacao = valor + (valor * taxa / 100) * tempo;
    
    System.out.println("O valor da prestação em atraso é: " + prestacao);
    
    sc.close();
}
}
