/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.biancapiva.exericicio11;

import java.util.Scanner;

/**
 *
 * @author piva.5936
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <=9; i++){
        System.out.println("Escreva o nome do aluno");
        String nome = scanner.nextLine();
        System.out.println("Escreva a nota do aluno");
        int nota = scanner.nextInt();
        scanner.nextLine();
        alunos[i] = new Aluno (nome, nota);
    }
        for (Aluno aluno : alunos) {
            aluno.resultado();
        }

    }}
