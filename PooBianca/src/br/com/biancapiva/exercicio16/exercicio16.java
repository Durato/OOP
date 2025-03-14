package br.com.biancapiva.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println(palavra.replace('A', '4')
                                    .replace('a', '4')
                                    .replace('E','3')
                                    .replace('e','3')
                                    .replace('I','1')
                                    .replace('i','1')
                                    .replace('O','0')
                                    .replace('o','0'));


    }}
