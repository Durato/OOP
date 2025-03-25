package br.com.biancapiva.exercicio27;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro.setTitulo("Pequeno Principe");
        livro.setAutor("Antoine de Saint-Exupéry");
        livro.setAnopublicacao(1943);

        livro2.setTitulo("Darth Plagueis");
        livro2.setAutor("James Lucino");
        livro2.setAnopublicacao(1990);

        livro3.setTitulo("Titulo");
        livro3.setAutor("Autor");
        livro3.setAnopublicacao(1990);

        System.out.println(livro.exibirLivro());
        System.out.println(livro2.exibirLivro());
        System.out.println(livro3.exibirLivro());
    }
}
