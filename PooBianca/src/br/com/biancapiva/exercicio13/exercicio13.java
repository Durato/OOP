package br.com.biancapiva.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva dois numeros: ");
        double numero = scanner.nextInt();
        double numerodois = scanner.nextInt();
        scanner.nextLine();

        double potencia = Math.pow(numero, numerodois);
        double raiz = Math.sqrt(potencia);
        double raizarredondada = Math.ceil(raiz);

        System.out.println("Porencia = "+potencia);
        System.out.println("Raiz = "+raizarredondada);

        scanner.close();
    }
}
