package br.com.biancapiva.exercicio25;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(500);
        conta.setNumerodaconta(01);
        conta.setTitular("Bianca");

        System.out.println(conta.exibirContaBancaria());

    }
}
