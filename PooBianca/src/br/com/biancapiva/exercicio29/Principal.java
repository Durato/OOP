package br.com.biancapiva.exercicio29;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Arroz", 2 , 25);

        produto1.setNome("Feijao");
        produto1.setQuantidade(3);
        produto1.setPreco(30);

        System.out.println(produto1.exibir());
        System.out.println(produto2.exibir());

    }
}
