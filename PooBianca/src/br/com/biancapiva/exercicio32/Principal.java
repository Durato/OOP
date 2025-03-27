package br.com.biancapiva.exercicio32;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Bianca", 10);
        Aluno aluno2 = new Aluno("Jeverson", 10);
        Aluno aluno3 = new Aluno("Joao", 8);

        System.out.println(aluno.exibirInfo());
        System.out.println(aluno2.exibirInfo());
        System.out.println(aluno3.exibirInfo());
    }
}
