package tarefa03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Informe o custo de fábrica do carro: ");
        double fabrica = scanner.nextDouble();
        
        
        double percentagemDistribuidor = 0.28;
        
       
        double impostos = 0.45;
        
        
        double custo = fabrica + (fabrica * percentagemDistribuidor) + (fabrica * impostos);
        
        
        System.out.println("O custo final ao consumidor é: " + custo);
        
       
        scanner.close();
    }
}
