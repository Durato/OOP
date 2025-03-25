package br.com.biancapiva.exercicio21;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner leia = new Scanner(System.in);
        int escolha = 0;

        System.out.println("Vamos registrar os dados do produto \n Qual o nome do produto? ");
        produto.nome = leia.nextLine();
        System.out.println("Qual o preco do produto? ");
        produto.preco = leia.nextDouble();
        System.out.println("Qual o quantidade do produto? ");
        produto.quantidadeEmEstoque = leia.nextInt();


        while (escolha < 4) {
            System.out.println("Escolha uma opcao \n 1- para vender\n 2- para repor o estoque\n 3- para exibir detalhes\n 4- para sair");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Quanto voce deseja vender? ");
                    produto.vender(leia.nextInt());
                    break;
                case 2:
                    System.out.println("Quanto voce deseja repor? ");
                    produto.reporestoque(leia.nextInt());
                    break;
                case 3:
                    System.out.println(produto.exibirdetalhes());
                    break;

                case 4:
                    System.out.println("Tchau");
                    break;
            }
        }

    }
}
