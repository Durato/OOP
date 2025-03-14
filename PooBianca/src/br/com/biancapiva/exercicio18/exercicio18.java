package br.com.biancapiva.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (Vogal(c)) {
                resultado.append(Character.toLowerCase(c));
            } else if (Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }


        }
                System.out.println("Resultado: " + resultado.toString());
    }
    public static boolean Vogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
