package br.com.biancapiva.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();
        int escolha = 0;

        System.out.println("Digite o nome do titular da conta: ");
        contaBancaria.titular = leia.nextLine();
        System.out.println("Digite o saldo do titular da conta: ");
        contaBancaria.saldo = leia.nextDouble();


        while (escolha < 4) {
            System.out.println("Escolha uma opcao \n 1- para sacar\n 2- para depositar\n 3- para exibir saldo\n 4- para sair");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Quanto voce deseja sacar? ");
                    contaBancaria.sacar(leia.nextDouble());
                    break;
                case 2:
                    System.out.println("Quanto voce deseja depositar? ");
                    contaBancaria.depositar(leia.nextDouble());
                    break;
                case 3:
                    System.out.println(contaBancaria.exibirsaldo(contaBancaria.saldo));
                    break;

                case 4:
                    System.out.println("Tchau");
                    break;
            }
        }
    }
}
