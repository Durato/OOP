package br.com.biancapiva.exercicio21;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto() {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public String vender(int quantidade) {
        if (quantidadeEmEstoque > quantidade) {
            quantidadeEmEstoque -= quantidade;
            return quantidade + " Estoque";
        }
        else{
            System.out.println("invalido");
        }
        return "";
    }
    public String reporestoque(int quantidade) {
        if(quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            return quantidade + " Estoque";
        }
        else{
            System.out.println("invalido");
        }
        return "";
    }
    public String exibirdetalhes() {
        return nome + "Preco = " + preco + " - " + " Estoque = " + quantidadeEmEstoque ;

    }
}
