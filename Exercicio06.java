package tarefa03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Informe a temperatura em graus Fahrenheit : ");
        double f = sc.nextDouble();

        double c = (f - 32) * (5.0 / 9.0);

        System.out.println("A temperatura em graus Celsius é : " + c);
        
        sc.close();
    }
}
