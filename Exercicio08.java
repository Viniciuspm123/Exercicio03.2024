package tarefa03;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a velocidade média durante a viagem (em Km/h): ");
        double velocidadeMedia = sc.nextDouble();

        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        double tempo = sc.nextDouble();
        
        double distancia = tempo * velocidadeMedia;
        
        double litros = distancia / 12;
        
        System.out.println("Velocidade média: " + velocidadeMedia + " Km/h");
        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " Km");
        System.out.println("Quantidade de litros de combustível gasta: " + litros + " litros");

        sc.close();
    }
}