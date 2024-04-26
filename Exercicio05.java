package tarefa03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em graus Celsius: ");
        double c = sc.nextDouble();
        
        double f = (9 * c + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + f);
        
        sc.close();
    }
}