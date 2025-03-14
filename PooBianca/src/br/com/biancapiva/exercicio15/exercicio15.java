package br.com.biancapiva.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        int numero = scanner.nextInt();

        int cubo = (int) Math.pow(numero,3);

        System.out.println("Seu numero elevado ao cubo e = "+cubo);
    }}
