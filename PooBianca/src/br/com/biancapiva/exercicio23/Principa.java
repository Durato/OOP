package br.com.biancapiva.exercicio23;

import java.util.Scanner;

public class Principa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Curso curso = new Curso();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = leia.nextLine();
        System.out.println("Digite a idade do aluno: ");
        aluno.idade = leia.nextInt();
        System.out.println("Digite a matricula do aluno: ");
        aluno.matricula = leia.nextLine();
        aluno.matricula = leia.nextLine();
        System.out.println("Digite o nome do curso: ");
        curso.nomecurso = leia.nextLine();
        System.out.println("Digite o codigo do curso: ");
        curso.codigocurso = leia.nextInt();

        System.out.println(aluno.exibirAluno());
        System.out.println(curso.exibirCurso());

    }
}
