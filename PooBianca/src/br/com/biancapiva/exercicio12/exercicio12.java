package br.com.biancapiva.exercicio12;

import br.com.biancapiva.exericicio11.Aluno;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        String nomes = "";
        Pessoa[] pessoas = new Pessoa[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <=9; i++){
            System.out.println("Escreva o nome da pessoa");
            String nome = scanner.nextLine();

            pessoas[i] = new Pessoa (nome);


        if (i > 0) {
            nomes += ", ";
        }
        nomes += pessoas[i].getNome();
    }
        System.out.println("Nomes: " + nomes);

        scanner.close();


    }}

