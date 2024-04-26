package tarefa03;

import java.util.Scanner;

public class Exercicio10 {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor para a variável A: ");
        String A = sc.nextLine();

        System.out.print("Informe o valor para a variável B: ");
        String B = sc.nextLine();
        
        String temp = A;
        A = B;
        B = temp;

        System.out.println("Valor da variável A após a troca: " + A);
        System.out.println("Valor da variável B após a troca: " + B);

        sc.close();
    }
}
