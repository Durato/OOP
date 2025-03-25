package br.com.biancapiva.exercicio23;

public class Aluno {
    String nome;
    int idade;
    String matricula;

    public Aluno() {
    }

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String exibirAluno() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nMatricula: " + matricula;
    }
}
