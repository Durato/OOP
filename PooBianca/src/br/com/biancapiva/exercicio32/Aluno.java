package br.com.biancapiva.exercicio32;

public class Aluno {
    private String nome;
    private float nota;

    public Aluno() {
    }

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String exibirInfo(){
        return "Nome: " + nome + "\nNota: " + nota;
    }

}
