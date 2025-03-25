package br.com.biancapiva.exercicio24;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Bianca";
        aluno.idade = 20;
        aluno.matricula = "123456789";

        System.out.println(aluno.exibirAluno());


    }
}
