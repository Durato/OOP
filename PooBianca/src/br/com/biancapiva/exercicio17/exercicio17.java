package br.com.biancapiva.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println(palavra);
        System.out.println(palavraInvertida);
}}

