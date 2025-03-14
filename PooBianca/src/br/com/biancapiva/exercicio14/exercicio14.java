package br.com.biancapiva.exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int randomico = 0, radomicodois = 51;

        randomico = (int) (Math.random()*101);
        radomicodois = 51+  (int) (Math.random()*50);

        int maior = Math.max(randomico, radomicodois);
        int cubo = (int) Math.pow(maior,3);

        System.out.println(maior);
        System.out.println(cubo);
    }
}
