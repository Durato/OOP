package br.com.biancapiva.exercicio34;

public class Funcionario {
    private String nome;
    private static int totalFuncionarios = 0;

    public Funcionario() {
    this.totalFuncionarios += 1 ;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public static void setTotalFuncionarios(int totalFuncionarios) {
        Funcionario.totalFuncionarios = totalFuncionarios;
    }
}
