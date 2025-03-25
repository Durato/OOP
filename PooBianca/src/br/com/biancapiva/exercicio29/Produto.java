package br.com.biancapiva.exercicio29;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, int quantidade, float preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String exibir() {
        return "Nome: " + nome + "\nPreco: " + preco + "\nQuantidade: " + quantidade;
    }
}
