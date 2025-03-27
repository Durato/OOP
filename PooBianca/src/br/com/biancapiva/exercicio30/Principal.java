package br.com.biancapiva.exercicio30;

public class Principal {
    public static void main(String[] args) {
        LojaVeiculos SuperMotors = new LojaVeiculos("SuperMotors", 10000.0);

        System.out.println(SuperMotors.venderVeiculo(100.0));
        System.out.println(SuperMotors.venderVeiculo(200.0));
        System.out.println(SuperMotors.venderVeiculo(300.0));
        System.out.println(SuperMotors.darDesconto(1500.00));
        System.out.println(SuperMotors.darDesconto(2000.00));
        System.out.println(SuperMotors.getFaturamento());
    }
}
