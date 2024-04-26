package tarefa03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        final double pi = Math.PI;

        System.out.print("Informe o raio da base da lata (em metros): ");
        double raio = sc.nextDouble();

        System.out.print("Informe a altura da lata (em metros): ");
        double altura = sc.nextDouble();

        double volume = pi * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é: " + volume + " metros cúbicos");

        sc.close();
    }
}